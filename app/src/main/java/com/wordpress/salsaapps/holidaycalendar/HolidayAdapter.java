package com.wordpress.salsaapps.holidaycalendar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 7/28/2015.
 */
public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.HolidayViewHolder> {

    private List<Holiday> holidayList;

    public HolidayAdapter(List<Holiday> holidayList) {
        this.holidayList = holidayList;
    }

    @Override
    public int getItemCount() {
        return holidayList.size();
    }

    @Override
    public void onBindViewHolder(HolidayViewHolder holidayViewHolder, int i) {
        Holiday h = holidayList.get(i);
        holidayViewHolder.vName.setText(h.name);
        holidayViewHolder.vDate.setText(h.date);


    }

    public HolidayViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card, viewGroup, false);

        return new HolidayViewHolder(itemView);
    }

    public static class HolidayViewHolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vDate;

        public HolidayViewHolder(View v) {
            super(v);
            this.vName = (TextView) v.findViewById(R.id.holiday_name);
            this.vDate = (TextView) v.findViewById(R.id.holiday_date);

        }
    }
}

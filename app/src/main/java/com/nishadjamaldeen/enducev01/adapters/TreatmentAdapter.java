package com.nishadjamaldeen.enducev01.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nishadjamaldeen.enducev01.R;
import com.nishadjamaldeen.enducev01.data.Treatment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anjam_000 on 2018-01-24.
 */

public class TreatmentAdapter extends ArrayAdapter<Treatment> {

    private Context context;
    private int resourceID;
    private ArrayList<Treatment> treatments  = null;

    public TreatmentAdapter(Context context, int resourceID, List<Treatment> list){
        super(context, resourceID, list);
        this.context = context;
        this.resourceID = resourceID;
        this.treatments = (ArrayList<Treatment>) list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        TreatmentPlace treatmentPlace = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(resourceID, parent, false);

            treatmentPlace = new TreatmentPlace();
            treatmentPlace.name = (TextView) row.findViewById(R.id.name);
            treatmentPlace.duration = (TextView) row.findViewById(R.id.duration);
            treatmentPlace.frequency = (TextView) row.findViewById(R.id.frequency);
            treatmentPlace.intensity = (TextView) row.findViewById(R.id.intensity);

            row.setTag(treatmentPlace);

        }
        else
        {
            treatmentPlace = (TreatmentPlace) row.getTag();
        }

        Treatment treatment = treatments.get(position);
        treatmentPlace.duration.setText(String.valueOf(treatment.getDuration()));
        treatmentPlace.name.setText(String.valueOf(treatment.getName()));
        treatmentPlace.intensity.setText(String.valueOf(treatment.getIntensity()));
        treatmentPlace.frequency.setText(String.valueOf(treatment.getFrequency()));

        return row;
    }

    class TreatmentPlace{
        protected TextView name;
        protected TextView intensity;
        protected TextView frequency;
        protected TextView duration;
    }


}



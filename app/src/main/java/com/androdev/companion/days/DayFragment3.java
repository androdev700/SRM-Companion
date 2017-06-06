package com.androdev.companion.days;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androdev.companion.R;
import com.androdev.companion.views.EntryFragment;

/**
 * Created by ayushsingh on 02/01/17.
 */

public class DayFragment3 extends Fragment {

    public DayFragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.fragment_day_fragment3, container, false);

        SharedPreferences pref2,room2;
        pref2 = getContext().getSharedPreferences("day3",0);
        room2 = getContext().getSharedPreferences("class3",0);

        TextView hour1 = (TextView) v.findViewById(R.id.d3class1);
        TextView hour2 = (TextView) v.findViewById(R.id.d3class2);
        TextView hour3 = (TextView) v.findViewById(R.id.d3class3);
        TextView hour4 = (TextView) v.findViewById(R.id.d3class4);
        TextView hour5 = (TextView) v.findViewById(R.id.d3class5);
        TextView hour6 = (TextView) v.findViewById(R.id.d3class6);
        TextView hour7 = (TextView) v.findViewById(R.id.d3class7);
        TextView hour8 = (TextView) v.findViewById(R.id.d3class8);
        TextView hour9 = (TextView) v.findViewById(R.id.d3class9);
        TextView hour10 = (TextView) v.findViewById(R.id.d3class10);

        TextView class1 = (TextView) v.findViewById(R.id.d3room1);
        TextView class2 = (TextView) v.findViewById(R.id.d3room2);
        TextView class3 = (TextView) v.findViewById(R.id.d3room3);
        TextView class4 = (TextView) v.findViewById(R.id.d3room4);
        TextView class5 = (TextView) v.findViewById(R.id.d3room5);
        TextView class6 = (TextView) v.findViewById(R.id.d3room6);
        TextView class7 = (TextView) v.findViewById(R.id.d3room7);
        TextView class8 = (TextView) v.findViewById(R.id.d3room8);
        TextView class9 = (TextView) v.findViewById(R.id.d3room9);
        TextView class10 = (TextView) v.findViewById(R.id.d3room10);

        hour1.setText(pref2.getString("hour1",getString(R.string.free)));
        hour2.setText(pref2.getString("hour2",getString(R.string.free)));
        hour3.setText(pref2.getString("hour3",getString(R.string.free)));
        hour4.setText(pref2.getString("hour4",getString(R.string.free)));
        hour5.setText(pref2.getString("hour5",getString(R.string.free)));
        hour6.setText(pref2.getString("hour6",getString(R.string.free)));
        hour7.setText(pref2.getString("hour7",getString(R.string.free)));
        hour8.setText(pref2.getString("hour8",getString(R.string.free)));
        hour9.setText(pref2.getString("hour9",getString(R.string.free)));
        hour10.setText(pref2.getString("hour10",getString(R.string.free)));

        class1.setText(room2.getString("class1",getString(R.string.free1)));
        class2.setText(room2.getString("class2",getString(R.string.free1)));
        class3.setText(room2.getString("class3",getString(R.string.free1)));
        class4.setText(room2.getString("class4",getString(R.string.free1)));
        class5.setText(room2.getString("class5",getString(R.string.free1)));
        class6.setText(room2.getString("class6",getString(R.string.free1)));
        class7.setText(room2.getString("class7",getString(R.string.free1)));
        class8.setText(room2.getString("class8",getString(R.string.free1)));
        class9.setText(room2.getString("class9",getString(R.string.free1)));
        class10.setText(room2.getString("class10",getString(R.string.free1)));
        return v;
    }

    public static Fragment newInstance() {
        DayFragment3 fragment = new DayFragment3();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;

    }
}

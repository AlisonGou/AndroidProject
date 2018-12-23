package com.example.alisongou.crimeIntent;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alisongou on 12/22/18.
 */

public class CrimeListFragment extends Fragment {
    private RecyclerView mCrimeRecyclerview;
    private CrimeAdaptor crimeAdaptor;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_crime_list,container,false);

        mCrimeRecyclerview=view.findViewById(R.id.crime_recycler_view);
        mCrimeRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;

    }


   private void updateUI(){
        CrimeLab crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes=crimeLab.getmCrimes();

        crimeAdaptor = new CrimeAdaptor(crimes);
        mCrimeRecyclerview.setAdapter(crimeAdaptor);


   }

    private class CrimeHolder extends RecyclerView.ViewHolder{
        private TextView mTitleView;
        private TextView mDateview;
        private CheckBox mSolvedCheckbox;
        private Crime mcrime;


        public CrimeHolder(View itemView) {
            super(itemView);
            mTitleView = (TextView)itemView.findViewById(R.id.list_item_title_textview);
            mDateview =(TextView)itemView.findViewById(R.id.list_item_date_textview);
            mSolvedCheckbox = itemView.findViewById(R.id.list_item_solved_check_box);
        }

        public void bindcrime(Crime crime){
            mcrime=crime;
            mTitleView.setText(mcrime.getmTitile());
            mDateview.setText(mcrime.getmDate().toString());
            mSolvedCheckbox.setChecked(mcrime.ismSolved());

        }
    }



    private class CrimeAdaptor extends RecyclerView.Adapter<CrimeHolder> {

        private List<Crime> mCrimes;

        public CrimeAdaptor(List<Crime> crimes) {
            mCrimes = crimes;
        }

        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_crime, parent, false);
            return new CrimeHolder(view);
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {
            Crime crime = mCrimes.get(position);
            holder.bindcrime(crime);
        }

        @Override
        public int getItemCount() {
            return 0;
        }

    }



}

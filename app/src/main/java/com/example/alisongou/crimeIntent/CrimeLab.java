package com.example.alisongou.crimeIntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by alisongou on 12/22/18.
 */

public class CrimeLab {
    private static CrimeLab scrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if (scrimeLab ==null){
            scrimeLab=new CrimeLab(context);
        }
        return  scrimeLab;

    }


    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for (int i=0;i<100;i++){
            Crime crime= new Crime();
            crime.setmTitile("crime #"+i);
            //crime.setSolved(i%2==0);
            mCrimes.add(crime);
        }

    }

    public List<Crime> getmCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID uuid){
        for (Crime crime : mCrimes){
            if (crime.getmId().equals(uuid))
            return  crime;
        }
        return null;
    }


}

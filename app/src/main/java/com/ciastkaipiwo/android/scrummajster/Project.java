package com.ciastkaipiwo.android.scrummajster;

import java.util.Date;

/**
 * Created by Daniel on 30.03.2018.
 */

public class Project {
    private String mTitle;
    private Date mStartDate;
    private Date mEndDate;

    Project(String title, Date startDate, Date endDate) {
        mTitle = title;
        mStartDate = startDate;
        mEndDate = endDate;
    }

    public String getTitle() {
        return mTitle;
    }
    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }

    public Date getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Date endDate) {
        mEndDate = endDate;
    }

}

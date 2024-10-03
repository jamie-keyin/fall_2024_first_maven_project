package com.keyin;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Example {
    private DataSource dataSource;

    public Date getTodaysDate() {
        return new Date();
    }

    public int getCurrentMonth() {
        return Calendar.getInstance().get(Calendar.MONTH);
    }

    public String getDataSourceName() {
        return getDataSource().getDataSourceName();
    }

    public DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new DataSource();
        }

        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}

package com.ojaswitechnologies.ashishdake.googlemap.Model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class Person implements ClusterItem {

    private final LatLng mPosition;
    private String id;
    private String snippet;

    public Person(double lat, double lng, String id, String snippet) {
        this.id = id;
        this.snippet = snippet;
        mPosition = new LatLng(lat, lng);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    @Override
    public String getTitle() {
        return id;
    }

    @Override
    public String getSnippet() {
        return snippet;
    }
}

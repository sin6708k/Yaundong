package com.example.map.mapdata

import com.google.firebase.firestore.GeoPoint

class MapData {
    lateinit var geoPoint: GeoPoint
    lateinit var equipments: List<String>
}
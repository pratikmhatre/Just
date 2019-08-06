package com.example.callerid.data

import com.example.callerid.data.network.ApiInterface
import com.example.callerid.data.sharedprefs.PrefsFace

interface DataManager : PrefsFace, ApiInterface{

}
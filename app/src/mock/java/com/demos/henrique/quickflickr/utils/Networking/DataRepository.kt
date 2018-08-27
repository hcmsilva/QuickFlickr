package com.demos.henrique.quickflickr.utils.Networking

import com.demos.henrique.quickflickr.utils.DataContract

class DataRepository
{
    companion object {
        @JvmStatic
        fun getDataRepository(baseEndpointUrl: String): DataContract
        {
            return ApiFakeImpl()
        }
    }
}
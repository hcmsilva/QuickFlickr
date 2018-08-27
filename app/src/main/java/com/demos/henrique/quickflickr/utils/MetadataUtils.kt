package com.demos.henrique.quickflickr.utils

class MetadataUtils
{
    fun extractAuthor(rawAuthor: String): String
    {
        val authorExtras1 = "nobody@flickr.com (\""
        val authorExtras2 = "\")"

        return rawAuthor.replace(authorExtras1, "")
                .replace(authorExtras2,"")
    }

    fun extractTime(rawTime: String): String
    {
        val regExSeconds = "(:[0-9][0-9]Z)"

        return rawTime.replace("T",", ")
                .replace(Regex(regExSeconds), "")
    }
}

package com.axpo.xrem.desktop.pages

import geb.Page

/**
 * Created by santy on 9/10/16.
 */
class RealTimePage extends Page {
    static url = "reports/main"

    static at = {
        title == "Axpo XREM - Principal"
    }

    static content = {
        title { $("title")}
    }
}

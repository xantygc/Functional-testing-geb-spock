package com.axpo.xrem.desktop.pages

import geb.Page

/**
 * Created by santy on 9/04/17.
 */
class BudgetFollowUpPage extends Page {

    static url = "reports/winbis/performance-overview-production/"

    static at = {
        title == "Axpo XREM - Evolución Anual"
    }

    static content = {
        title { $("title")}
    }

}

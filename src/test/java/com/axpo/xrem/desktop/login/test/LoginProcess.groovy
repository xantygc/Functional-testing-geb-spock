package com.axpo.xrem.desktop.login.test

import com.axpo.xrem.desktop.pages.LoginPage
import com.axpo.xrem.desktop.pages.RealTimePage
import geb.spock.GebReportingSpec
import geb.spock.GebSpec

/**
 * Created by santy on 9/10/16.
 */

class LoginProcess extends GebReportingSpec{



    def "login with user and password valid" ()
    {

        when: "go to Login page"
            to LoginPage

        and: "fill user and password"
            fillForm("santiago.gonzalezcourel@axpo.com","xxxxxxxxx")

        then: "navigate to login page properly"
            at RealTimePage
    }
}

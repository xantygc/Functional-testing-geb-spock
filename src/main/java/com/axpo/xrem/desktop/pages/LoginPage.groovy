package com.axpo.xrem.desktop.pages

import geb.Page

/**
 * Created by santy on 9/10/16.
 */
class LoginPage extends Page
{
    static url = "users/login/"

    static at = {
        title == "Axpo XREM - Iniciar sesión"
    }

    static content = {
        title { $("title")}
        loginButton { $("input[name=submit]") }
    }

    void fillForm(String user, String password)
    {
        $("input[name=username]").value(user);
        $("input[name=password]").value(password);
        loginButton.click();
    }
}

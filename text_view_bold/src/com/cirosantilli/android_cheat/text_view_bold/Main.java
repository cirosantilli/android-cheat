package com.cirosantilli.android_cheat.text_view_bold;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = new TextView(this);
        tv.setText(Html.fromHtml(
            "noformat <b>bold</b> <i>italic</i>" +
            "<br>before break<br>after break<br>" +
            "<p>paragraph 1</p><p>paragraph 2</p>" +
            "<div>div1</div><div>div2</div>" +
            "<font color='#FF0000'>font red</font>"
        ));
        setContentView(tv);
    }
}

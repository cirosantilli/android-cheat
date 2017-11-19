package com.cirosantilli.android_cheat.textviewhyperlink;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView textView = new TextView(this);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml(
            "<a href=\"http://example.com\">example.com</a>" +
            "<br>" +
            "<br>" +
            "<br>" +
            "<a href=\"http://google.com\">google.com</a>"
        ));
        setContentView(textView);
    }
}

package com.example.myapplication.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class ViewGroupsActivity extends AppCompatActivity {

    private TextView mTextViewLongText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_groups);
        initView();
    }

    private void initView() {
        mTextViewLongText = findViewById(R.id.text_view_Long_text);
        mTextViewLongText.setText("\n" +
                "What is Lorem ipsum?\n" +
                "\n" +
                "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.\n" +
                "\n" +
                "For example, when designing a brochure or book, a designer will insert Lorem ipsum text if the real text is not available. The Lorem ipsum text looks real enough that the brochure or book looks complete. The book or brochure can be shown to the client for approval.\n" +
                "\n" +
                "The important factor when using Lorem ipsum text is that the text looks realistic otherwise the brochure or book will not look very good. Lorem Ipsum is dummy text which has no meaning however looks very similar to real text.\n" +
                "\n" +
                "Common names for Lorem ipsum text include:\n" +
                "\n" +
                "- blind text\n" +
                "- dummy text\n" +
                "- greeked text\n" +
                "- placeholder text\n" +
                "- mock content\n" +
                "- filler text");
    }
}

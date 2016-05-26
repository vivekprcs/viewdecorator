package hu.nemi.appcompat.view;

import android.util.AttributeSet;
import android.view.View;

interface ViewFactory {
    View createView(View parent, String name, AttributeSet attrs);
}

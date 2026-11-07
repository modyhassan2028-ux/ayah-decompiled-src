package com.ayah.note;

import K9.AbstractC0405x;
import O9.y;
import P7.h;
import P9.d;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import p000a.a;
import p074h0.i;
import p124m3.j;
import p125m4.b;
import p150o9.c;

/* JADX INFO: loaded from: classes.dex */
public final class NoteActivity extends Hilt_NoteActivity {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f13906i0 = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f13908X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f13909Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f13910Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13911a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13912b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public EditText f13914d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Toolbar f13915e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public h f13916f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j f13917g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public i f13918h0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final d f13907W = a.a();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f13913c0 = -1;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        p251z9.j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // android.app.Activity
    public final void finish() {
        EditText editText = this.f13914d0;
        c cVar = null;
        if (editText == null) {
            p251z9.j.k("editor");
            throw null;
        }
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = p251z9.j.f(string.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        AbstractC0405x.x(this.f13907W, null, new y(string.subSequence(i10, length + 1).toString(), this, cVar, 23), 3);
        super.finish();
    }

    @Override // com.ayah.note.Hilt_NoteActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(262176);
        window.setSoftInputMode(4);
        setFinishOnTouchOutside(false);
        setContentView(R.layout.note_modal);
        View viewFindViewById = findViewById(R.id.toolbar);
        p251z9.j.d(viewFindViewById, "findViewById(...)");
        this.f13915e0 = (Toolbar) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.note);
        p251z9.j.d(viewFindViewById2, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById2;
        this.f13914d0 = editText;
        int i10 = 1;
        h hVar = new h(this, i10);
        this.f13916f0 = hVar;
        editText.addTextChangedListener(hVar);
        Resources resources = getResources();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        c cVar = null;
        this.f13908X = resources.getColor(R.color.tint, null);
        EditText editText2 = this.f13914d0;
        if (editText2 == null) {
            p251z9.j.k("editor");
            throw null;
        }
        editText2.setTextColor(getResources().getColor(R.color.text, null));
        int intExtra = getIntent().getIntExtra("AYAH_ID", -1);
        this.f13913c0 = intExtra;
        if (intExtra == -1) {
            finish();
        }
        AbstractC0405x.x(this.f13907W, null, new p098j6.b(this, cVar, i10), 3);
    }

    @Override // com.ayah.note.Hilt_NoteActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        EditText editText = this.f13914d0;
        if (editText == null) {
            p251z9.j.k("editor");
            throw null;
        }
        h hVar = this.f13916f0;
        if (hVar == null) {
            p251z9.j.k("watcher");
            throw null;
        }
        editText.removeTextChangedListener(hVar);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p251z9.j.e(motionEvent, "event");
        if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        finish();
        return true;
    }
}

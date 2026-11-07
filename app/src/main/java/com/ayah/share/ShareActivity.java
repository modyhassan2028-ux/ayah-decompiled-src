package com.ayah.share;

import H9.p;
import K9.AbstractC0405x;
import P9.d;
import Z0.B;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.SwitchCompat;
import com.ayah.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p000a.a;
import p120l9.m;
import p125m4.b;
import p192t6.f;
import p248z6.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ShareActivity extends Hilt_ShareActivity {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f13920i0 = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final d f13921W = a.a();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public RadioGroup f13922X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SwitchCompat f13923Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Spinner f13924Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Spinner f13925a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Button f13926b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c f13927c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Object f13928d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p124m3.a f13929e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f13930f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public p057f4.c f13931g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public B f13932h0;

    public static final void s(ShareActivity shareActivity, Spinner spinner, int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        if (i10 <= i11) {
            int i13 = i10;
            while (true) {
                p124m3.a aVar = shareActivity.f13929e0;
                if (aVar == null) {
                    j.k("chapter");
                    throw null;
                }
                arrayList.add(aVar.b() + ": " + b.f19615b.format(i13));
                if (i13 != i11) {
                    i13++;
                }
            }
        }
        spinner.setAdapter((SpinnerAdapter) new p127m6.d(shareActivity, arrayList, i10));
        spinner.setSelection(i12 - i10);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // com.ayah.share.Hilt_ShareActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar;
        int i10;
        super.onCreate(bundle);
        setContentView(R.layout.share_modal);
        View viewFindViewById = findViewById(R.id.titlebar);
        j.d(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R.id.from_spinner);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f13925a0 = (Spinner) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.to_spinner);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f13924Z = (Spinner) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.share_format);
        j.d(viewFindViewById4, "findViewById(...)");
        this.f13922X = (RadioGroup) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.add_badge);
        j.d(viewFindViewById5, "findViewById(...)");
        this.f13923Y = (SwitchCompat) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.share);
        Button button = (Button) viewFindViewById6;
        button.setEnabled(false);
        button.setOnClickListener(new E5.b(7, this));
        j.d(viewFindViewById6, "apply(...)");
        this.f13926b0 = (Button) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.root);
        Resources resources = getResources();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        viewFindViewById7.setBackgroundColor(resources.getColor(R.color.grouped_background, null));
        Button button2 = this.f13926b0;
        if (button2 == null) {
            j.k("shareButton");
            throw null;
        }
        button2.setTextColor(getResources().getColor(R.color.text, null));
        Button button3 = this.f13926b0;
        if (button3 == null) {
            j.k("shareButton");
            throw null;
        }
        button3.setBackgroundResource(R.drawable.secondary_list_selector);
        int color = getResources().getColor(R.color.secondary_grouped_background, null);
        findViewById(R.id.verse_section).setBackgroundColor(color);
        RadioGroup radioGroup = this.f13922X;
        if (radioGroup == null) {
            j.k("formatGroup");
            throw null;
        }
        radioGroup.setBackgroundColor(color);
        findViewById(R.id.shared_with_ayah_parent).setBackgroundColor(color);
        SwitchCompat switchCompat = this.f13923Y;
        if (switchCompat == null) {
            j.k("addBadgeSwitch");
            throw null;
        }
        f.c(this, switchCompat, true, true);
        this.f13930f0 = getResources().getDimensionPixelSize(R.dimen.title_font_size);
        synchronized (c.class) {
            try {
                if (c.f24845t == null) {
                    c.f24845t = new c(getApplicationContext());
                }
                cVar = c.f24845t;
            } catch (Throwable th) {
                throw th;
            }
        }
        j.d(cVar, "getInstance(...)");
        this.f13927c0 = cVar;
        SwitchCompat switchCompat2 = this.f13923Y;
        if (switchCompat2 == null) {
            j.k("addBadgeSwitch");
            throw null;
        }
        switchCompat2.setChecked(((SharedPreferences) cVar.f24847s).getBoolean("shareEnableBadge", true));
        c cVar2 = this.f13927c0;
        if (cVar2 == null) {
            j.k("prefUtils");
            throw null;
        }
        int i11 = ((SharedPreferences) cVar2.f24847s).getInt("lastShareType", 0);
        if (i11 != 1) {
            i10 = i11 != 2 ? R.id.image_button : R.id.text_with_diacritics_button;
        } else {
            i10 = R.id.text_button;
        }
        RadioGroup radioGroup2 = this.f13922X;
        if (radioGroup2 == null) {
            j.k("formatGroup");
            throw null;
        }
        radioGroup2.check(i10);
        j.d(p106k4.b.f18991b, "getInstance(...)");
        Intent intent = getIntent();
        if (intent != null) {
            AbstractC0405x.x(this.f13921W, null, new p127m6.b(this, intent.getIntExtra("EXTRA_AYAH_NUMBER", 1), intent.getIntExtra("EXTRA_SURA_NUMBER", 1), null), 3);
        } else {
            finish();
        }
    }

    @Override // com.ayah.share.Hilt_ShareActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        AbstractC0405x.h(this.f13921W, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        RadioGroup radioGroup = this.f13922X;
        if (radioGroup == null) {
            j.k("formatGroup");
            throw null;
        }
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        int i10 = 0;
        if (checkedRadioButtonId != R.id.image_button) {
            if (checkedRadioButtonId == R.id.text_button) {
                i10 = 1;
            } else if (checkedRadioButtonId == R.id.text_with_diacritics_button) {
                i10 = 2;
            }
        }
        c cVar = this.f13927c0;
        if (cVar == null) {
            j.k("prefUtils");
            throw null;
        }
        ((SharedPreferences) cVar.f24847s).edit().putInt("lastShareType", i10).apply();
        c cVar2 = this.f13927c0;
        if (cVar2 == null) {
            j.k("prefUtils");
            throw null;
        }
        SwitchCompat switchCompat = this.f13923Y;
        if (switchCompat == null) {
            j.k("addBadgeSwitch");
            throw null;
        }
        ((SharedPreferences) cVar2.f24847s).edit().putBoolean("shareEnableBadge", switchCompat.isChecked()).apply();
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    public final void t(boolean z10, boolean z11) {
        String strI0;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(524288);
        if (z11) {
            strI0 = p.I0("\n        " + getString(R.string.share_with_link) + "\n        " + getString(R.string.share_with_url) + "\n        ");
        } else {
            strI0 = "";
        }
        StringBuilder sb = new StringBuilder("﴿");
        Spinner spinner = this.f13925a0;
        if (spinner == null) {
            j.k("fromSpinner");
            throw null;
        }
        int selectedItemId = ((int) spinner.getSelectedItemId()) - 1;
        Spinner spinner2 = this.f13924Z;
        if (spinner2 == null) {
            j.k("toSpinner");
            throw null;
        }
        int selectedItemId2 = ((int) spinner2.getSelectedItemId()) - 1;
        if (selectedItemId <= selectedItemId2) {
            int i10 = selectedItemId;
            while (true) {
                ?? r10 = this.f13928d0;
                if (r10 == 0) {
                    j.k("suraVerses");
                    throw null;
                }
                p124m3.j jVar = (p124m3.j) r10.get(i10);
                if (i10 != selectedItemId) {
                    sb.append("\u06dd");
                }
                sb.append(z10 ? jVar.f19587c : jVar.f19588d);
                if (i10 == selectedItemId2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        sb.append("﴾");
        Spinner spinner3 = this.f13925a0;
        if (spinner3 == null) {
            j.k("fromSpinner");
            throw null;
        }
        int selectedItemId3 = ((int) spinner3.getSelectedItemId()) - 1;
        Spinner spinner4 = this.f13924Z;
        if (spinner4 == null) {
            j.k("toSpinner");
            throw null;
        }
        int selectedItemId4 = ((int) spinner4.getSelectedItemId()) - 1;
        ?? r11 = this.f13928d0;
        if (r11 == 0) {
            j.k("suraVerses");
            throw null;
        }
        int i11 = ((p124m3.j) r11.get(selectedItemId3)).f19586b;
        ?? r12 = this.f13928d0;
        if (r12 == 0) {
            j.k("suraVerses");
            throw null;
        }
        int i12 = ((p124m3.j) r12.get(selectedItemId4)).f19586b;
        ?? r13 = this.f13928d0;
        if (r13 == 0) {
            j.k("suraVerses");
            throw null;
        }
        p124m3.a aVar = ((p124m3.j) m.f0(r13)).f19596n;
        Pattern pattern = f.f22619a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("[");
        spannableStringBuilder.append((CharSequence) aVar.b());
        spannableStringBuilder.append((CharSequence) ": ");
        NumberFormat numberFormat = b.f19615b;
        spannableStringBuilder.append((CharSequence) numberFormat.format(i11));
        if (i12 > i11) {
            spannableStringBuilder.append((CharSequence) "-");
            spannableStringBuilder.append((CharSequence) numberFormat.format(i12));
        }
        spannableStringBuilder.append((CharSequence) "]");
        intent.putExtra("android.intent.extra.TEXT", p.I0("\n   " + ((Object) sb) + " " + ((Object) spannableStringBuilder) + "\n   " + strI0 + "\n   "));
        startActivity(Intent.createChooser(intent, getString(R.string.action_share)));
    }
}

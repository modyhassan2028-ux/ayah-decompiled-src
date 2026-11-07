package com.ayah;

import G4.m;
import I1.I;
import I1.S;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ayah.ui.PreferencesFragment;
import com.google.android.gms.internal.measurement.C0816g0;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.BiConsumer;
import org.xmlpull.v1.XmlPullParserException;
import p020c.l;
import p035d3.x;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0928a;
import p056f2.C0949w;
import p056f2.L;
import p120l9.s;
import p125m4.b;
import p166q4.c;

/* JADX INFO: loaded from: classes.dex */
public class PreferencesActivity extends x {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f13662d0 = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View f13663W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Toolbar f13664X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ViewGroup f13665Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13666Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ProgressDialog f13667a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public PreferencesFragment f13668b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c f13669c0;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // android.app.Activity
    public final void finish() {
        PreferencesFragment preferencesFragment = this.f13668b0;
        preferencesFragment.getClass();
        Intent intent = new Intent();
        if (preferencesFragment.f13940D0) {
            intent.putExtra("THEME_CHANGED", true);
        }
        setResult(-1, intent);
        super.finish();
    }

    @Override // p035d3.x, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a(this);
        setContentView(R.layout.preferences);
        this.f13663W = findViewById(R.id.root);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        findViewById(R.id.shadow).setVisibility(8);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f13664X = toolbar;
        TextView textView = (TextView) toolbar.findViewById(R.id.title);
        this.f13666Z = textView;
        textView.setText(R.string.settings);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_container);
        this.f13665Y = viewGroup;
        C6.b bVar = new C6.b(16, this);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(viewGroup, bVar);
        L l10 = ((C0949w) this.f12591L.f9953r).f16175u;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uC = l10.C(R.id.content);
        if (abstractComponentCallbacksC0947uC instanceof PreferencesFragment) {
            this.f13668b0 = (PreferencesFragment) abstractComponentCallbacksC0947uC;
        } else {
            this.f13668b0 = new PreferencesFragment();
            C0928a c0928a = new C0928a(l10);
            c0928a.f(R.id.content, this.f13668b0, null, 2);
            c0928a.e(false, true);
        }
        q(this.f13664X);
        p050e8.b bVarP = p();
        if (bVarP != null) {
            bVarP.V(true);
            bVarP.W();
        }
        s();
        c cVar = this.f13669c0;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        final m mVar = new m(10, bundle2);
        Map.EL.forEach(s.f19441r, new BiConsumer() { // from class: q4.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) throws XmlPullParserException, IOException {
                mVar.invoke(obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        C0846m0 c0846m0 = ((FirebaseAnalytics) cVar.f21305a.getValue()).f15394a;
        c0846m0.getClass();
        c0846m0.a(new C0816g0(c0846m0, (String) null, "Open Settings Screen", bundle2, false));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void s() {
        Drawable navigationIcon;
        this.f13663W.setBackgroundColor(getColor(R.color.background));
        int color = getColor(R.color.quran_bars);
        this.f13664X.setBackgroundColor(color);
        this.f13665Y.setBackgroundColor(color);
        this.f13666Z.setTextColor(getColor(R.color.text));
        Toolbar toolbar = this.f13664X;
        if (toolbar == null || (navigationIcon = toolbar.getNavigationIcon()) == null) {
            return;
        }
        navigationIcon.setColorFilter(getColor(R.color.tint), PorterDuff.Mode.SRC_IN);
    }
}

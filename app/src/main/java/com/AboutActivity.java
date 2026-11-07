package com.ayah;

import I1.I;
import I1.S;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.ayah.AboutActivity;
import com.ayah.R;
import java.util.WeakHashMap;
import p020c.l;
import p035d3.C0920b;
import p125m4.b;

/* JADX INFO: loaded from: classes.dex */
public class AboutActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f13601W = 0;
    public int S;
    public int T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f13602V;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a(this);
        setContentView(R.layout.about);
        findViewById(R.id.shadow).setVisibility(8);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView textView = (TextView) toolbar.findViewById(R.id.title);
        textView.setText(R.string.about_ayah);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_container);
        C6.b bVar = new C6.b(14, viewGroup);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(viewGroup, bVar);
        q(toolbar);
        p050e8.b bVarP = p();
        if (bVarP != null) {
            bVarP.V(true);
            bVarP.W();
        }
        ListView listView = (ListView) findViewById(R.id.list);
        I.m(listView, new C6.b(15, listView));
        View viewInflate = getLayoutInflater().inflate(R.layout.about_header, (ViewGroup) listView, false);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.version);
        textView2.setText(String.format(getString(R.string.about_version), "7.8.2"));
        listView.addHeaderView(viewInflate);
        int color = getColor(R.color.quran_bars);
        viewGroup.setBackgroundColor(color);
        int color2 = getColor(R.color.secondary_text);
        textView2.setTextColor(color2);
        this.S = color2;
        this.T = color2;
        this.U = color2;
        this.f13602V = color2;
        findViewById(R.id.root).setBackgroundColor(getColor(R.color.grouped_background));
        toolbar.setBackgroundColor(color);
        textView.setTextColor(color2);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(getColor(R.color.tint), PorterDuff.Mode.SRC_IN);
        }
        listView.setSelector(R.drawable.list_selector);
        listView.setAdapter((ListAdapter) new C0920b(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: d3.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                int i11 = AboutActivity.f13601W;
                AboutActivity aboutActivity = this.f15593r;
                aboutActivity.getClass();
                if (i10 == 1) {
                    if (aboutActivity.r("market://details?id=" + aboutActivity.getPackageName())) {
                        return;
                    }
                    aboutActivity.r("https://play.google.com/store/apps/details?id=" + aboutActivity.getPackageName());
                    return;
                }
                if (i10 == 2) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.addFlags(524288);
                    intent.putExtra("android.intent.extra.TEXT", aboutActivity.getString(R.string.share_ayah_share_string) + aboutActivity.getString(R.string.share_ayah_share_url));
                    aboutActivity.startActivity(Intent.createChooser(intent, aboutActivity.getString(R.string.share_ayah)));
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    aboutActivity.r("https://twitter.com/ayah_app");
                    return;
                }
                String string = aboutActivity.getString(R.string.feedback_email);
                String str = String.format(aboutActivity.getString(R.string.feedback_subject), "7.8.2");
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("message/rfc822");
                intent2.putExtra("android.intent.extra.EMAIL", new String[]{string});
                intent2.putExtra("android.intent.extra.SUBJECT", str);
                aboutActivity.startActivity(Intent.createChooser(intent2, aboutActivity.getString(R.string.contact_us)));
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final boolean r(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

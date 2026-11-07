package com.ayah.feature.infolist.ui.wrapper.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import com.ayah.R;
import com.ayah.feature.infolist.ui.wrapper.view.SuraQuarterListWrapper;
import com.google.android.material.button.MaterialButtonToggleGroup;
import p202u7.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SuraQuarterListWrapper extends LinearLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13788u = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ViewSwitcher f13789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SuraListWrapper f13790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final QuarterListWrapper f13791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuraQuarterListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        SuraListWrapper suraListWrapper = new SuraListWrapper(context);
        this.f13790s = suraListWrapper;
        QuarterListWrapper quarterListWrapper = new QuarterListWrapper(context);
        this.f13791t = quarterListWrapper;
        setOrientation(1);
        setBackgroundColor(context.getColor(R.color.grouped_background));
        View.inflate(context, R.layout.sura_quarter_wrapper, this);
        View viewFindViewById = findViewById(R.id.view_switcher);
        j.d(viewFindViewById, "findViewById(...)");
        ViewSwitcher viewSwitcher = (ViewSwitcher) viewFindViewById;
        this.f13789r = viewSwitcher;
        viewSwitcher.addView(suraListWrapper, new LinearLayout.LayoutParams(-1, -1));
        viewSwitcher.addView(quarterListWrapper, new LinearLayout.LayoutParams(-1, -1));
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.sura_quarters_toggle);
        materialButtonToggleGroup.b(R.id.suras, true);
        materialButtonToggleGroup.f14734t.add(new e() { // from class: R4.d
            @Override // p202u7.e
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z10) {
                SuraQuarterListWrapper suraQuarterListWrapper = this.f7229a;
                ViewSwitcher viewSwitcher2 = suraQuarterListWrapper.f13789r;
                int i11 = SuraQuarterListWrapper.f13788u;
                if (!z10) {
                    if (materialButtonToggleGroup2.getCheckedButtonId() == -1) {
                        materialButtonToggleGroup2.b(i10, true);
                    }
                } else if (i10 == R.id.suras && !j.a(viewSwitcher2.getCurrentView(), suraQuarterListWrapper.f13790s)) {
                    viewSwitcher2.showNext();
                } else {
                    if (i10 != R.id.quarters || j.a(viewSwitcher2.getCurrentView(), suraQuarterListWrapper.f13791t)) {
                        return;
                    }
                    viewSwitcher2.showNext();
                }
            }
        });
    }
}

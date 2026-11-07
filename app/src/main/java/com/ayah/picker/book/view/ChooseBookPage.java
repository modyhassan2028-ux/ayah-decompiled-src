package com.ayah.feature.picker.book.view;

import B5.b;
import E5.a;
import E5.c;
import K9.AbstractC0405x;
import M.k;
import P9.d;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p193t7.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ChooseBookPage extends Hilt_ChooseBookPage {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public d f13822J0 = AbstractC0405x.d();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public b f13823K0;
    public k L0;

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.choose_book, viewGroup, false);
        Context contextM = M();
        LayoutInflater layoutInflaterM = m();
        j.d(layoutInflaterM, "getLayoutInflater(...)");
        this.f13823K0 = new b(layoutInflaterM, new c(1, this, ChooseBookPage.class, "onDownloadBook", "onDownloadBook(Lcom/ayah/common/data/source/json/model/booklist/BookType;)V", 0, 0, 0), new a(0, this));
        View viewFindViewById = viewInflate.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        b bVar = this.f13823K0;
        if (bVar == null) {
            j.k("chooseBookAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        j.d(viewFindViewById, "apply(...)");
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(contextM.getColor(R.color.secondary_background));
        toolbar.setTitle(R.string.select_book);
        toolbar.setNavigationOnClickListener(new E5.b(0, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void D() {
        AbstractC0405x.h(this.f13822J0, null);
        super.D();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog T(Bundle bundle) {
        Dialog dialogT = super.T(bundle);
        final e eVar = (e) dialogT;
        dialogT.setOnShowListener(new DialogInterface.OnShowListener() { // from class: V3.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e eVar2 = eVar;
                View viewFindViewById = eVar2.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    layoutParams.height = -1;
                    viewFindViewById.setLayoutParams(layoutParams);
                }
                if (eVar2.f22638w == null) {
                    eVar2.g();
                }
                BottomSheetBehavior bottomSheetBehavior = eVar2.f22638w;
                j.d(bottomSheetBehavior, "getBehavior(...)");
                bottomSheetBehavior.L(3);
                bottomSheetBehavior.f14672a0 = true;
            }
        });
        return dialogT;
    }

    @Override // com.ayah.feature.picker.book.view.Hilt_ChooseBookPage, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void y(Context context) {
        j.e(context, "context");
        super.y(context);
        this.f13822J0 = AbstractC0405x.d();
        AbstractC0405x.x(this.f13822J0, null, new E5.d(this, B1.E(M()), null, 2), 3);
    }
}

package com.ayah.common.data.source.preference.model;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKhatmahJsonAdapter extends JsonAdapter<PreferencesKhatmah> {
    private final JsonAdapter<Integer> intAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public PreferencesKhatmahJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("plan", "startDateIso", "startingDayIndex", "currentDayIndex");
        t tVar = t.f19442r;
        this.stringAdapter = c10.b(String.class, tVar, "plan");
        this.intAdapter = c10.b(Integer.TYPE, tVar, "startingDayIndex");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                str = (String) this.stringAdapter.a(nVar);
                if (str == null) {
                    throw d.j("plan", "plan", nVar);
                }
            } else if (iV == 1) {
                str2 = (String) this.stringAdapter.a(nVar);
                if (str2 == null) {
                    throw d.j("startDateIso", "startDateIso", nVar);
                }
            } else if (iV == 2) {
                num = (Integer) this.intAdapter.a(nVar);
                if (num == null) {
                    throw d.j("startingDayIndex", "startingDayIndex", nVar);
                }
            } else if (iV == 3 && (num2 = (Integer) this.intAdapter.a(nVar)) == null) {
                throw d.j("currentDayIndex", "currentDayIndex", nVar);
            }
        }
        nVar.n();
        if (str == null) {
            throw d.e("plan", "plan", nVar);
        }
        if (str2 == null) {
            throw d.e("startDateIso", "startDateIso", nVar);
        }
        if (num == null) {
            throw d.e("startingDayIndex", "startingDayIndex", nVar);
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new PreferencesKhatmah(iIntValue, num2.intValue(), str, str2);
        }
        throw d.e("currentDayIndex", "currentDayIndex", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        PreferencesKhatmah preferencesKhatmah = (PreferencesKhatmah) obj;
        j.e(sVar, "writer");
        if (preferencesKhatmah == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("plan");
        this.stringAdapter.e(sVar, preferencesKhatmah.f13699a);
        sVar.w("startDateIso");
        this.stringAdapter.e(sVar, preferencesKhatmah.f13700b);
        sVar.w("startingDayIndex");
        this.intAdapter.e(sVar, Integer.valueOf(preferencesKhatmah.f13701c));
        sVar.w("currentDayIndex");
        this.intAdapter.e(sVar, Integer.valueOf(preferencesKhatmah.f13702d));
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(PreferencesKhatmah)");
        return sb.toString();
    }
}

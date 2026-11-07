package com.ayah.common.data.dao.notification;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ReminderDestination_SuraJsonAdapter extends JsonAdapter<ReminderDestination.Sura> {
    private final JsonAdapter<Integer> intAdapter;
    private final m options;

    public ReminderDestination_SuraJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("sura", "page");
        this.intAdapter = c10.b(Integer.TYPE, t.f19442r, "sura");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        Integer num = null;
        Integer num2 = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                num = (Integer) this.intAdapter.a(nVar);
                if (num == null) {
                    throw d.j("sura", "sura", nVar);
                }
            } else if (iV == 1 && (num2 = (Integer) this.intAdapter.a(nVar)) == null) {
                throw d.j("page", "page", nVar);
            }
        }
        nVar.n();
        if (num == null) {
            throw d.e("sura", "sura", nVar);
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new ReminderDestination.Sura(iIntValue, num2.intValue());
        }
        throw d.e("page", "page", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        ReminderDestination.Sura sura = (ReminderDestination.Sura) obj;
        j.e(sVar, "writer");
        if (sura == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("sura");
        this.intAdapter.e(sVar, Integer.valueOf(sura.f13671a));
        sVar.w("page");
        this.intAdapter.e(sVar, Integer.valueOf(sura.f13672b));
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(ReminderDestination.Sura)");
        return sb.toString();
    }
}

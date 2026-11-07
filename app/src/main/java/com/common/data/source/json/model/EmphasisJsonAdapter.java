package com.ayah.common.data.source.json.model;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class EmphasisJsonAdapter extends JsonAdapter<Emphasis> {
    private final JsonAdapter<Integer> intAdapter;
    private final m options;

    public EmphasisJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("location", "length");
        this.intAdapter = c10.b(Integer.TYPE, t.f19442r, "location");
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
                    throw d.j("location", "location", nVar);
                }
            } else if (iV == 1 && (num2 = (Integer) this.intAdapter.a(nVar)) == null) {
                throw d.j("length", "length", nVar);
            }
        }
        nVar.n();
        if (num == null) {
            throw d.e("location", "location", nVar);
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new Emphasis(iIntValue, num2.intValue());
        }
        throw d.e("length", "length", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Emphasis emphasis = (Emphasis) obj;
        j.e(sVar, "writer");
        if (emphasis == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("location");
        this.intAdapter.e(sVar, Integer.valueOf(emphasis.f13679a));
        sVar.w("length");
        this.intAdapter.e(sVar, Integer.valueOf(emphasis.f13680b));
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(Emphasis)");
        return sb.toString();
    }
}

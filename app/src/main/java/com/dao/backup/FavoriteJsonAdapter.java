package com.ayah.dao.backup;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class FavoriteJsonAdapter extends JsonAdapter<Favorite> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final m options;

    public FavoriteJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("index");
        this.intAdapter = c10.b(Integer.TYPE, t.f19442r, "index");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        Integer num = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0 && (num = (Integer) this.intAdapter.a(nVar)) == null) {
                throw d.j("index", "index", nVar);
            }
        }
        nVar.n();
        if (num != null) {
            return new Favorite(num.intValue());
        }
        throw d.e("index", "index", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Favorite favorite = (Favorite) obj;
        j.e(sVar, "writer");
        if (favorite == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("index");
        this.intAdapter.e(sVar, Integer.valueOf(favorite.f13732a));
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(Favorite)");
        return sb.toString();
    }
}

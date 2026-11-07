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
public final class ChapterTextJsonAdapter extends JsonAdapter<ChapterText> {
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public ChapterTextJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("title", "body");
        this.stringAdapter = c10.b(String.class, t.f19442r, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        String str = null;
        String str2 = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                str = (String) this.stringAdapter.a(nVar);
                if (str == null) {
                    throw d.j("title", "title", nVar);
                }
            } else if (iV == 1 && (str2 = (String) this.stringAdapter.a(nVar)) == null) {
                throw d.j("body", "body", nVar);
            }
        }
        nVar.n();
        if (str == null) {
            throw d.e("title", "title", nVar);
        }
        if (str2 != null) {
            return new ChapterText(str, str2);
        }
        throw d.e("body", "body", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        ChapterText chapterText = (ChapterText) obj;
        j.e(sVar, "writer");
        if (chapterText == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("title");
        this.stringAdapter.e(sVar, chapterText.f13676a);
        sVar.w("body");
        this.stringAdapter.e(sVar, chapterText.f13677b);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(ChapterText)");
        return sb.toString();
    }
}

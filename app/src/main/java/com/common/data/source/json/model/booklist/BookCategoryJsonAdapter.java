package com.ayah.common.data.source.json.model.booklist;

import V8.d;
import com.google.android.gms.internal.measurement.B1;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.util.List;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BookCategoryJsonAdapter extends JsonAdapter<BookCategory> {
    private final JsonAdapter<List<BookType>> listOfBookTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public BookCategoryJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("id", "title", "books", "unavailableText");
        t tVar = t.f19442r;
        this.stringAdapter = c10.b(String.class, tVar, "id");
        this.listOfBookTypeAdapter = c10.b(B1.G(BookType.class), tVar, "books");
        this.nullableStringAdapter = c10.b(String.class, tVar, "unavailableText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                str = (String) this.stringAdapter.a(nVar);
                if (str == null) {
                    throw d.j("id", "id", nVar);
                }
            } else if (iV == 1) {
                str2 = (String) this.stringAdapter.a(nVar);
                if (str2 == null) {
                    throw d.j("title", "title", nVar);
                }
            } else if (iV == 2) {
                list = (List) this.listOfBookTypeAdapter.a(nVar);
                if (list == null) {
                    throw d.j("books", "books", nVar);
                }
            } else if (iV == 3) {
                str3 = (String) this.nullableStringAdapter.a(nVar);
            }
        }
        nVar.n();
        if (str == null) {
            throw d.e("id", "id", nVar);
        }
        if (str2 == null) {
            throw d.e("title", "title", nVar);
        }
        if (list != null) {
            return new BookCategory(str, str2, str3, list);
        }
        throw d.e("books", "books", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        BookCategory bookCategory = (BookCategory) obj;
        j.e(sVar, "writer");
        if (bookCategory == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("id");
        this.stringAdapter.e(sVar, bookCategory.f13681a);
        sVar.w("title");
        this.stringAdapter.e(sVar, bookCategory.f13682b);
        sVar.w("books");
        this.listOfBookTypeAdapter.e(sVar, bookCategory.f13683c);
        sVar.w("unavailableText");
        this.nullableStringAdapter.e(sVar, bookCategory.f13684d);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(BookCategory)");
        return sb.toString();
    }
}

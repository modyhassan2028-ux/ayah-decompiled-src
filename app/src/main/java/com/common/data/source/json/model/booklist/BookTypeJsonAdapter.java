package com.ayah.common.data.source.json.model.booklist;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BookTypeJsonAdapter extends JsonAdapter<BookType> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BookType> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public BookTypeJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("id", "date", "title", "subtitle", "isConcise", "isHidden", "footnotePattern", "standaloneTitle");
        t tVar = t.f19442r;
        this.stringAdapter = c10.b(String.class, tVar, "id");
        this.booleanAdapter = c10.b(Boolean.TYPE, tVar, "isConcise");
        this.nullableStringAdapter = c10.b(String.class, tVar, "footnotePattern");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        BookType bookType;
        j.e(nVar, "reader");
        Boolean bool = Boolean.FALSE;
        nVar.e();
        int i10 = -1;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            Boolean bool3 = bool;
            if (!nVar.w()) {
                nVar.n();
                if (i10 == -33) {
                    Boolean bool4 = bool2;
                    if (str == null) {
                        throw d.e("id", "id", nVar);
                    }
                    if (str2 == null) {
                        throw d.e("date", "date", nVar);
                    }
                    if (str3 == null) {
                        throw d.e("title", "title", nVar);
                    }
                    if (str4 == null) {
                        throw d.e("subtitle", "subtitle", nVar);
                    }
                    if (bool4 == null) {
                        throw d.e("isConcise", "isConcise", nVar);
                    }
                    bookType = new BookType(str, str2, str3, str4, bool4.booleanValue(), bool3.booleanValue(), str5);
                } else {
                    Boolean bool5 = bool2;
                    Constructor<BookType> declaredConstructor = this.constructorRef;
                    int i11 = i10;
                    if (declaredConstructor == null) {
                        Class cls = Boolean.TYPE;
                        declaredConstructor = BookType.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, cls, String.class, Integer.TYPE, d.f8427c);
                        this.constructorRef = declaredConstructor;
                        j.d(declaredConstructor, "also(...)");
                    }
                    if (str == null) {
                        throw d.e("id", "id", nVar);
                    }
                    if (str2 == null) {
                        throw d.e("date", "date", nVar);
                    }
                    if (str3 == null) {
                        throw d.e("title", "title", nVar);
                    }
                    if (str4 == null) {
                        throw d.e("subtitle", "subtitle", nVar);
                    }
                    if (bool5 == null) {
                        throw d.e("isConcise", "isConcise", nVar);
                    }
                    BookType bookTypeNewInstance = declaredConstructor.newInstance(str, str2, str3, str4, bool5, bool3, str5, Integer.valueOf(i11), null);
                    j.d(bookTypeNewInstance, "newInstance(...)");
                    bookType = bookTypeNewInstance;
                }
                if (str6 == null) {
                    str6 = bookType.f13691h;
                }
                j.e(str6, "<set-?>");
                bookType.f13691h = str6;
                return bookType;
            }
            switch (nVar.V(this.options)) {
                case -1:
                    nVar.b0();
                    nVar.c0();
                    break;
                case 0:
                    str = (String) this.stringAdapter.a(nVar);
                    if (str == null) {
                        throw d.j("id", "id", nVar);
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.a(nVar);
                    if (str2 == null) {
                        throw d.j("date", "date", nVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.a(nVar);
                    if (str3 == null) {
                        throw d.j("title", "title", nVar);
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.a(nVar);
                    if (str4 == null) {
                        throw d.j("subtitle", "subtitle", nVar);
                    }
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.a(nVar);
                    if (bool2 == null) {
                        throw d.j("isConcise", "isConcise", nVar);
                    }
                    break;
                case 5:
                    bool = (Boolean) this.booleanAdapter.a(nVar);
                    if (bool == null) {
                        throw d.j("isHidden", "isHidden", nVar);
                    }
                    i10 = -33;
                    continue;
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.a(nVar);
                    break;
                case 7:
                    str6 = (String) this.stringAdapter.a(nVar);
                    if (str6 == null) {
                        throw d.j("standaloneTitle", "standaloneTitle", nVar);
                    }
                    break;
            }
            bool = bool3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        BookType bookType = (BookType) obj;
        j.e(sVar, "writer");
        if (bookType == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("id");
        this.stringAdapter.e(sVar, bookType.f13685a);
        sVar.w("date");
        this.stringAdapter.e(sVar, bookType.f13686b);
        sVar.w("title");
        this.stringAdapter.e(sVar, bookType.f13687c);
        sVar.w("subtitle");
        this.stringAdapter.e(sVar, bookType.f13688d);
        sVar.w("isConcise");
        this.booleanAdapter.e(sVar, Boolean.valueOf(bookType.f13689e));
        sVar.w("isHidden");
        this.booleanAdapter.e(sVar, Boolean.valueOf(bookType.f13690f));
        sVar.w("footnotePattern");
        this.nullableStringAdapter.e(sVar, bookType.g);
        sVar.w("standaloneTitle");
        this.stringAdapter.e(sVar, bookType.f13691h);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(BookType)");
        return sb.toString();
    }
}

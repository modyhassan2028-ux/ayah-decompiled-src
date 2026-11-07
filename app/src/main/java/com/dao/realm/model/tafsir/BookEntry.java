package com.ayah.dao.realm.model.tafsir;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class BookEntry extends RealmObject implements com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface {

    @Index
    private Long chapterNumber;

    @Index
    private long order;

    @Index
    private Long pageNumber;
    private String text;

    @Index
    private String type;

    @Index
    private Long verseID;

    /* JADX WARN: Multi-variable type inference failed */
    public BookEntry() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$type("");
    }

    public final Long getChapterNumber() {
        return realmGet$chapterNumber();
    }

    public final long getOrder() {
        return realmGet$order();
    }

    public final Long getPageNumber() {
        return realmGet$pageNumber();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final String getType() {
        return realmGet$type();
    }

    public final Long getVerseID() {
        return realmGet$verseID();
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$chapterNumber() {
        return this.chapterNumber;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public long realmGet$order() {
        return this.order;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$pageNumber() {
        return this.pageNumber;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$verseID() {
        return this.verseID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$chapterNumber(Long l10) {
        this.chapterNumber = l10;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$order(long j) {
        this.order = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$pageNumber(Long l10) {
        this.pageNumber = l10;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$verseID(Long l10) {
        this.verseID = l10;
    }

    public final void setChapterNumber(Long l10) {
        realmSet$chapterNumber(l10);
    }

    public final void setOrder(long j) {
        realmSet$order(j);
    }

    public final void setPageNumber(Long l10) {
        realmSet$pageNumber(l10);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setType(String str) {
        j.e(str, "<set-?>");
        realmSet$type(str);
    }

    public final void setVerseID(Long l10) {
        realmSet$verseID(l10);
    }
}

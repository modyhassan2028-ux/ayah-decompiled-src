package com.ayah.dao.realm.model.quran;

import io.realm.RealmObject;
import io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;

/* JADX INFO: loaded from: classes.dex */
public class ChapterHeader extends RealmObject implements com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface {
    private float centerX;
    private float centerY;
    private Chapter chapter;
    private long line;
    private Page page;

    /* JADX WARN: Multi-variable type inference failed */
    public ChapterHeader() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final float getCenterX() {
        return realmGet$centerX();
    }

    public final float getCenterY() {
        return realmGet$centerY();
    }

    public final Chapter getChapter() {
        return realmGet$chapter();
    }

    public final long getLine() {
        return realmGet$line();
    }

    public final Page getPage() {
        return realmGet$page();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public float realmGet$centerX() {
        return this.centerX;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public float realmGet$centerY() {
        return this.centerY;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public Chapter realmGet$chapter() {
        return this.chapter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public long realmGet$line() {
        return this.line;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public Page realmGet$page() {
        return this.page;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$centerX(float f3) {
        this.centerX = f3;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$centerY(float f3) {
        this.centerY = f3;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$chapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$line(long j) {
        this.line = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$page(Page page) {
        this.page = page;
    }

    public final void setCenterX(float f3) {
        realmSet$centerX(f3);
    }

    public final void setCenterY(float f3) {
        realmSet$centerY(f3);
    }

    public final void setChapter(Chapter chapter) {
        realmSet$chapter(chapter);
    }

    public final void setLine(long j) {
        realmSet$line(j);
    }

    public final void setPage(Page page) {
        realmSet$page(page);
    }
}

// This is a generated file. Not intended for manual editing.
package org.yalang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.yalang.psi.YaLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.yalang.psi.*;

public class YaLangExprStmtImpl extends ASTWrapperPsiElement implements YaLangExprStmt {

  public YaLangExprStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitExprStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaLangAnnassign getAnnassign() {
    return findChildByClass(YaLangAnnassign.class);
  }

  @Override
  @Nullable
  public YaLangAugassign getAugassign() {
    return findChildByClass(YaLangAugassign.class);
  }

  @Override
  @Nullable
  public YaLangTestlist getTestlist() {
    return findChildByClass(YaLangTestlist.class);
  }

  @Override
  @NotNull
  public List<YaLangTestlistStarExpr> getTestlistStarExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YaLangTestlistStarExpr.class);
  }

  @Override
  @Nullable
  public YaLangYieldExpr getYieldExpr() {
    return findChildByClass(YaLangYieldExpr.class);
  }

}
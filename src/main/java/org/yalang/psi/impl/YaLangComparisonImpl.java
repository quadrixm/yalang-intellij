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

public class YaLangComparisonImpl extends ASTWrapperPsiElement implements YaLangComparison {

  public YaLangComparisonImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaLangVisitor visitor) {
    visitor.visitComparison(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaLangVisitor) accept((YaLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YaLangCompOp> getCompOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YaLangCompOp.class);
  }

  @Override
  @NotNull
  public List<YaLangExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YaLangExpr.class);
  }

}
// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaLangExprlist extends PsiElement {

  @NotNull
  List<YaLangExpr> getExprList();

  @NotNull
  List<YaLangStarExpr> getStarExprList();

}
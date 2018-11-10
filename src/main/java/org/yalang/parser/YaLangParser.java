// This is a generated file. Not intended for manual editing.
package org.yalang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.yalang.psi.YaLangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YaLangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AND_EXPR) {
      r = and_expr(b, 0);
    }
    else if (t == AND_TEST) {
      r = and_test(b, 0);
    }
    else if (t == ANNASSIGN) {
      r = annassign(b, 0);
    }
    else if (t == ARGLIST) {
      r = arglist(b, 0);
    }
    else if (t == ARGUMENT) {
      r = argument(b, 0);
    }
    else if (t == ARITH_EXPR) {
      r = arith_expr(b, 0);
    }
    else if (t == ASSERT_STMT) {
      r = assert_stmt(b, 0);
    }
    else if (t == ASYNC_FUNCDEF) {
      r = async_funcdef(b, 0);
    }
    else if (t == ASYNC_STMT) {
      r = async_stmt(b, 0);
    }
    else if (t == ATOM) {
      r = atom(b, 0);
    }
    else if (t == ATOM_EXPR) {
      r = atom_expr(b, 0);
    }
    else if (t == AUGASSIGN) {
      r = augassign(b, 0);
    }
    else if (t == BREAK_STMT) {
      r = break_stmt(b, 0);
    }
    else if (t == CLASSDEF) {
      r = classdef(b, 0);
    }
    else if (t == COMP_FOR) {
      r = comp_for(b, 0);
    }
    else if (t == COMP_IF) {
      r = comp_if(b, 0);
    }
    else if (t == COMP_ITER) {
      r = comp_iter(b, 0);
    }
    else if (t == COMP_OP) {
      r = comp_op(b, 0);
    }
    else if (t == COMPARISON) {
      r = comparison(b, 0);
    }
    else if (t == COMPOUND_STMT) {
      r = compound_stmt(b, 0);
    }
    else if (t == CONTINUE_STMT) {
      r = continue_stmt(b, 0);
    }
    else if (t == DECORATED) {
      r = decorated(b, 0);
    }
    else if (t == DECORATOR) {
      r = decorator(b, 0);
    }
    else if (t == DECORATORS) {
      r = decorators(b, 0);
    }
    else if (t == DEL_STMT) {
      r = del_stmt(b, 0);
    }
    else if (t == DICTORSETMAKER) {
      r = dictorsetmaker(b, 0);
    }
    else if (t == DOTTED_AS_NAME) {
      r = dotted_as_name(b, 0);
    }
    else if (t == DOTTED_AS_NAMES) {
      r = dotted_as_names(b, 0);
    }
    else if (t == DOTTED_NAME) {
      r = dotted_name(b, 0);
    }
    else if (t == ENCODING_DECL) {
      r = encoding_decl(b, 0);
    }
    else if (t == EVAL_INPUT) {
      r = eval_input(b, 0);
    }
    else if (t == EXCEPT_CLAUSE) {
      r = except_clause(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == EXPR_STMT) {
      r = expr_stmt(b, 0);
    }
    else if (t == EXPRLIST) {
      r = exprlist(b, 0);
    }
    else if (t == FACTOR) {
      r = factor(b, 0);
    }
    else if (t == FILE_INPUT) {
      r = file_input(b, 0);
    }
    else if (t == FLOW_STMT) {
      r = flow_stmt(b, 0);
    }
    else if (t == FOR_STMT) {
      r = for_stmt(b, 0);
    }
    else if (t == FUNCDEF) {
      r = funcdef(b, 0);
    }
    else if (t == GLOBAL_STMT) {
      r = global_stmt(b, 0);
    }
    else if (t == IF_STMT) {
      r = if_stmt(b, 0);
    }
    else if (t == IMPORT_AS_NAME) {
      r = import_as_name(b, 0);
    }
    else if (t == IMPORT_AS_NAMES) {
      r = import_as_names(b, 0);
    }
    else if (t == IMPORT_FROM) {
      r = import_from(b, 0);
    }
    else if (t == IMPORT_NAME) {
      r = import_name(b, 0);
    }
    else if (t == IMPORT_STMT) {
      r = import_stmt(b, 0);
    }
    else if (t == LAMBDEF) {
      r = lambdef(b, 0);
    }
    else if (t == LAMBDEF_NOCOND) {
      r = lambdef_nocond(b, 0);
    }
    else if (t == NONLOCAL_STMT) {
      r = nonlocal_stmt(b, 0);
    }
    else if (t == NOT_TEST) {
      r = not_test(b, 0);
    }
    else if (t == OR_TEST) {
      r = or_test(b, 0);
    }
    else if (t == PARAMETERS) {
      r = parameters(b, 0);
    }
    else if (t == PASS_STMT) {
      r = pass_stmt(b, 0);
    }
    else if (t == POWER) {
      r = power(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
    }
    else if (t == RAISE_STMT) {
      r = raise_stmt(b, 0);
    }
    else if (t == RETURN_STMT) {
      r = return_stmt(b, 0);
    }
    else if (t == SHIFT_EXPR) {
      r = shift_expr(b, 0);
    }
    else if (t == SIMPLE_STMT) {
      r = simple_stmt(b, 0);
    }
    else if (t == SINGLE_INPUT) {
      r = single_input(b, 0);
    }
    else if (t == SLICEOP) {
      r = sliceop(b, 0);
    }
    else if (t == SMALL_STMT) {
      r = small_stmt(b, 0);
    }
    else if (t == STAR_EXPR) {
      r = star_expr(b, 0);
    }
    else if (t == STMT) {
      r = stmt(b, 0);
    }
    else if (t == SUBSCRIPT) {
      r = subscript(b, 0);
    }
    else if (t == SUBSCRIPTLIST) {
      r = subscriptlist(b, 0);
    }
    else if (t == SUITE) {
      r = suite(b, 0);
    }
    else if (t == SYNC_COMP_FOR) {
      r = sync_comp_for(b, 0);
    }
    else if (t == TERM) {
      r = term(b, 0);
    }
    else if (t == TEST) {
      r = test(b, 0);
    }
    else if (t == TEST_NOCOND) {
      r = test_nocond(b, 0);
    }
    else if (t == TESTLIST) {
      r = testlist(b, 0);
    }
    else if (t == TESTLIST_COMP) {
      r = testlist_comp(b, 0);
    }
    else if (t == TESTLIST_STAR_EXPR) {
      r = testlist_star_expr(b, 0);
    }
    else if (t == TFPDEF) {
      r = tfpdef(b, 0);
    }
    else if (t == TRAILER) {
      r = trailer(b, 0);
    }
    else if (t == TRY_STMT) {
      r = try_stmt(b, 0);
    }
    else if (t == TYPEDARGSLIST) {
      r = typedargslist(b, 0);
    }
    else if (t == VARARGSLIST) {
      r = varargslist(b, 0);
    }
    else if (t == VFPDEF) {
      r = vfpdef(b, 0);
    }
    else if (t == WHILE_STMT) {
      r = while_stmt(b, 0);
    }
    else if (t == WITH_ITEM) {
      r = with_item(b, 0);
    }
    else if (t == WITH_STMT) {
      r = with_stmt(b, 0);
    }
    else if (t == XOR_EXPR) {
      r = xor_expr(b, 0);
    }
    else if (t == YIELD_ARG) {
      r = yield_arg(b, 0);
    }
    else if (t == YIELD_EXPR) {
      r = yield_expr(b, 0);
    }
    else if (t == YIELD_STMT) {
      r = yield_stmt(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return yaLangFile(b, l + 1);
  }

  /* ********************************************************** */
  // shift_expr ('&' shift_expr)*
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = shift_expr(b, l + 1);
    r = r && and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('&' shift_expr)*
  private static boolean and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expr_1", c)) break;
    }
    return true;
  }

  // '&' shift_expr
  private static boolean and_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "&");
    r = r && shift_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // not_test ('و' not_test)*
  public static boolean and_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_test")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_TEST, "<and test>");
    r = not_test(b, l + 1);
    r = r && and_test_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('و' not_test)*
  private static boolean and_test_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_test_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_test_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_test_1", c)) break;
    }
    return true;
  }

  // 'و' not_test
  private static boolean and_test_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_test_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "و");
    r = r && not_test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' test ['=' test]
  public static boolean annassign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annassign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNASSIGN, "<annassign>");
    r = consumeToken(b, ":");
    r = r && test(b, l + 1);
    r = r && annassign_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['=' test]
  private static boolean annassign_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annassign_2")) return false;
    annassign_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean annassign_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annassign_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // argument (',' argument)*  [',']
  public static boolean arglist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGLIST, "<arglist>");
    r = argument(b, l + 1);
    r = r && arglist_1(b, l + 1);
    r = r && arglist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' argument)*
  private static boolean arglist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arglist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arglist_1", c)) break;
    }
    return true;
  }

  // ',' argument
  private static boolean arglist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean arglist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // test [comp_for] |
  //             test '=' test |
  //             '**' test |
  //             '*' test
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = argument_0(b, l + 1);
    if (!r) r = argument_1(b, l + 1);
    if (!r) r = argument_2(b, l + 1);
    if (!r) r = argument_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // test [comp_for]
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && argument_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [comp_for]
  private static boolean argument_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0_1")) return false;
    comp_for(b, l + 1);
    return true;
  }

  // test '=' test
  private static boolean argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '**' test
  private static boolean argument_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' test
  private static boolean argument_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // term (('+'|'-') term)*
  public static boolean arith_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arith_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITH_EXPR, "<arith expr>");
    r = term(b, l + 1);
    r = r && arith_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('+'|'-') term)*
  private static boolean arith_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arith_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arith_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arith_expr_1", c)) break;
    }
    return true;
  }

  // ('+'|'-') term
  private static boolean arith_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arith_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arith_expr_1_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'|'-'
  private static boolean arith_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arith_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'أكد' test [',' test]
  public static boolean assert_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERT_STMT, "<assert stmt>");
    r = consumeToken(b, "أكد");
    r = r && test(b, l + 1);
    r = r && assert_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [',' test]
  private static boolean assert_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_stmt_2")) return false;
    assert_stmt_2_0(b, l + 1);
    return true;
  }

  // ',' test
  private static boolean assert_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'async' funcdef
  public static boolean async_funcdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "async_funcdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASYNC_FUNCDEF, "<async funcdef>");
    r = consumeToken(b, "async");
    r = r && funcdef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'async' (funcdef | with_stmt | for_stmt)
  public static boolean async_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "async_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASYNC_STMT, "<async stmt>");
    r = consumeToken(b, "async");
    r = r && async_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // funcdef | with_stmt | for_stmt
  private static boolean async_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "async_stmt_1")) return false;
    boolean r;
    r = funcdef(b, l + 1);
    if (!r) r = with_stmt(b, l + 1);
    if (!r) r = for_stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' [yield_expr|testlist_comp] ')' |
  //        '[' [testlist_comp] ']' |
  //        '{' [dictorsetmaker] '}' |
  //        NAME | NUMBER | STRING+ | '...' | 'لااحد' | 'صحيح' | 'زائف'
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = atom_0(b, l + 1);
    if (!r) r = atom_1(b, l + 1);
    if (!r) r = atom_2(b, l + 1);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = atom_5(b, l + 1);
    if (!r) r = consumeToken(b, "...");
    if (!r) r = consumeToken(b, "لااحد");
    if (!r) r = consumeToken(b, "صحيح");
    if (!r) r = consumeToken(b, "زائف");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' [yield_expr|testlist_comp] ')'
  private static boolean atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && atom_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [yield_expr|testlist_comp]
  private static boolean atom_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0_1")) return false;
    atom_0_1_0(b, l + 1);
    return true;
  }

  // yield_expr|testlist_comp
  private static boolean atom_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0_1_0")) return false;
    boolean r;
    r = yield_expr(b, l + 1);
    if (!r) r = testlist_comp(b, l + 1);
    return r;
  }

  // '[' [testlist_comp] ']'
  private static boolean atom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && atom_1_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [testlist_comp]
  private static boolean atom_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_1_1")) return false;
    testlist_comp(b, l + 1);
    return true;
  }

  // '{' [dictorsetmaker] '}'
  private static boolean atom_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && atom_2_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [dictorsetmaker]
  private static boolean atom_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_2_1")) return false;
    dictorsetmaker(b, l + 1);
    return true;
  }

  // STRING+
  private static boolean atom_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "atom_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['await'] atom trailer*
  public static boolean atom_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM_EXPR, "<atom expr>");
    r = atom_expr_0(b, l + 1);
    r = r && atom(b, l + 1);
    r = r && atom_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['await']
  private static boolean atom_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_expr_0")) return false;
    consumeToken(b, "await");
    return true;
  }

  // trailer*
  private static boolean atom_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trailer(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "atom_expr_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' |
  //             '<<=' | '>>=' | '**=' | '//='
  public static boolean augassign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "augassign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AUGASSIGN, "<augassign>");
    r = consumeToken(b, "+=");
    if (!r) r = consumeToken(b, "-=");
    if (!r) r = consumeToken(b, "*=");
    if (!r) r = consumeToken(b, "@=");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "%=");
    if (!r) r = consumeToken(b, "&=");
    if (!r) r = consumeToken(b, "|=");
    if (!r) r = consumeToken(b, "^=");
    if (!r) r = consumeToken(b, "<<=");
    if (!r) r = consumeToken(b, ">>=");
    if (!r) r = consumeToken(b, "**=");
    if (!r) r = consumeToken(b, "//=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'اكسر'
  public static boolean break_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, "<break stmt>");
    r = consumeToken(b, "اكسر");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'صنف' NAME ['(' [arglist] ')'] ':' suite
  public static boolean classdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASSDEF, "<classdef>");
    r = consumeToken(b, "صنف");
    r = r && consumeToken(b, NAME);
    r = r && classdef_2(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['(' [arglist] ')']
  private static boolean classdef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdef_2")) return false;
    classdef_2_0(b, l + 1);
    return true;
  }

  // '(' [arglist] ')'
  private static boolean classdef_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdef_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && classdef_2_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [arglist]
  private static boolean classdef_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdef_2_0_1")) return false;
    arglist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ['async'] sync_comp_for
  public static boolean comp_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_for")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMP_FOR, "<comp for>");
    r = comp_for_0(b, l + 1);
    r = r && sync_comp_for(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['async']
  private static boolean comp_for_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_for_0")) return false;
    consumeToken(b, "async");
    return true;
  }

  /* ********************************************************** */
  // 'لو' test_nocond [comp_iter]
  public static boolean comp_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_if")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMP_IF, "<comp if>");
    r = consumeToken(b, "لو");
    r = r && test_nocond(b, l + 1);
    r = r && comp_if_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [comp_iter]
  private static boolean comp_if_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_if_2")) return false;
    comp_iter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // comp_for | comp_if
  public static boolean comp_iter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_iter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMP_ITER, "<comp iter>");
    r = comp_for(b, l + 1);
    if (!r) r = comp_if(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in'|'is'|'is' 'not'
  public static boolean comp_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMP_OP, "<comp op>");
    r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, "<>");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, "in");
    if (!r) r = comp_op_8(b, l + 1);
    if (!r) r = consumeToken(b, "is");
    if (!r) r = comp_op_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'not' 'in'
  private static boolean comp_op_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_op_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "not");
    r = r && consumeToken(b, "in");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'is' 'not'
  private static boolean comp_op_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comp_op_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "is");
    r = r && consumeToken(b, "not");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr (comp_op expr)*
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = expr(b, l + 1);
    r = r && comparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comp_op expr)*
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1", c)) break;
    }
    return true;
  }

  // comp_op expr
  private static boolean comparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comp_op(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef | decorated | async_stmt
  public static boolean compound_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_STMT, "<compound stmt>");
    r = if_stmt(b, l + 1);
    if (!r) r = while_stmt(b, l + 1);
    if (!r) r = for_stmt(b, l + 1);
    if (!r) r = try_stmt(b, l + 1);
    if (!r) r = with_stmt(b, l + 1);
    if (!r) r = funcdef(b, l + 1);
    if (!r) r = classdef(b, l + 1);
    if (!r) r = decorated(b, l + 1);
    if (!r) r = async_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'استمر'
  public static boolean continue_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, "<continue stmt>");
    r = consumeToken(b, "استمر");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decorators (classdef | funcdef | async_funcdef)
  public static boolean decorated(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorated")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECORATED, "<decorated>");
    r = decorators(b, l + 1);
    r = r && decorated_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classdef | funcdef | async_funcdef
  private static boolean decorated_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorated_1")) return false;
    boolean r;
    r = classdef(b, l + 1);
    if (!r) r = funcdef(b, l + 1);
    if (!r) r = async_funcdef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '@' dotted_name [ '(' [arglist] ')' ] NEWLINE
  public static boolean decorator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECORATOR, "<decorator>");
    r = consumeToken(b, "@");
    r = r && dotted_name(b, l + 1);
    r = r && decorator_2(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '(' [arglist] ')' ]
  private static boolean decorator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorator_2")) return false;
    decorator_2_0(b, l + 1);
    return true;
  }

  // '(' [arglist] ')'
  private static boolean decorator_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorator_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && decorator_2_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [arglist]
  private static boolean decorator_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorator_2_0_1")) return false;
    arglist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // decorator+
  public static boolean decorators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decorators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECORATORS, "<decorators>");
    r = decorator(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decorators", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'حذف' exprlist
  public static boolean del_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "del_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEL_STMT, "<del stmt>");
    r = consumeToken(b, "حذف");
    r = r && exprlist(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((test ':' test | '**' expr)
  //                    (comp_for | (',' (test ':' test | '**' expr))* [','])) |
  //                   ((test | star_expr)
  //                    (comp_for | (',' (test | star_expr))* [',']))
  public static boolean dictorsetmaker(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DICTORSETMAKER, "<dictorsetmaker>");
    r = dictorsetmaker_0(b, l + 1);
    if (!r) r = dictorsetmaker_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (test ':' test | '**' expr)
  //                    (comp_for | (',' (test ':' test | '**' expr))* [','])
  private static boolean dictorsetmaker_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_0_0(b, l + 1);
    r = r && dictorsetmaker_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test ':' test | '**' expr
  private static boolean dictorsetmaker_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_0_0_0(b, l + 1);
    if (!r) r = dictorsetmaker_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test ':' test
  private static boolean dictorsetmaker_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '**' expr
  private static boolean dictorsetmaker_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comp_for | (',' (test ':' test | '**' expr))* [',']
  private static boolean dictorsetmaker_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comp_for(b, l + 1);
    if (!r) r = dictorsetmaker_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test ':' test | '**' expr))* [',']
  private static boolean dictorsetmaker_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_0_1_1_0(b, l + 1);
    r = r && dictorsetmaker_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test ':' test | '**' expr))*
  private static boolean dictorsetmaker_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dictorsetmaker_0_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dictorsetmaker_0_1_1_0", c)) break;
    }
    return true;
  }

  // ',' (test ':' test | '**' expr)
  private static boolean dictorsetmaker_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && dictorsetmaker_0_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test ':' test | '**' expr
  private static boolean dictorsetmaker_0_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_0_1_1_0_0_1_0(b, l + 1);
    if (!r) r = dictorsetmaker_0_1_1_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test ':' test
  private static boolean dictorsetmaker_0_1_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '**' expr
  private static boolean dictorsetmaker_0_1_1_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_0_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean dictorsetmaker_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_0_1_1_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  // (test | star_expr)
  //                    (comp_for | (',' (test | star_expr))* [','])
  private static boolean dictorsetmaker_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_1_0(b, l + 1);
    r = r && dictorsetmaker_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test | star_expr
  private static boolean dictorsetmaker_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_0")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // comp_for | (',' (test | star_expr))* [',']
  private static boolean dictorsetmaker_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comp_for(b, l + 1);
    if (!r) r = dictorsetmaker_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test | star_expr))* [',']
  private static boolean dictorsetmaker_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictorsetmaker_1_1_1_0(b, l + 1);
    r = r && dictorsetmaker_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test | star_expr))*
  private static boolean dictorsetmaker_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dictorsetmaker_1_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dictorsetmaker_1_1_1_0", c)) break;
    }
    return true;
  }

  // ',' (test | star_expr)
  private static boolean dictorsetmaker_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && dictorsetmaker_1_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test | star_expr
  private static boolean dictorsetmaker_1_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1_1_0_0_1")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // [',']
  private static boolean dictorsetmaker_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictorsetmaker_1_1_1_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // dotted_name ['as' NAME]
  public static boolean dotted_as_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_name")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotted_name(b, l + 1);
    r = r && dotted_as_name_1(b, l + 1);
    exit_section_(b, m, DOTTED_AS_NAME, r);
    return r;
  }

  // ['as' NAME]
  private static boolean dotted_as_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_name_1")) return false;
    dotted_as_name_1_0(b, l + 1);
    return true;
  }

  // 'as' NAME
  private static boolean dotted_as_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dotted_as_name (',' dotted_as_name)*
  public static boolean dotted_as_names(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_names")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotted_as_name(b, l + 1);
    r = r && dotted_as_names_1(b, l + 1);
    exit_section_(b, m, DOTTED_AS_NAMES, r);
    return r;
  }

  // (',' dotted_as_name)*
  private static boolean dotted_as_names_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_names_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dotted_as_names_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dotted_as_names_1", c)) break;
    }
    return true;
  }

  // ',' dotted_as_name
  private static boolean dotted_as_names_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_as_names_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && dotted_as_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME ('.' NAME)*
  public static boolean dotted_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_name")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && dotted_name_1(b, l + 1);
    exit_section_(b, m, DOTTED_NAME, r);
    return r;
  }

  // ('.' NAME)*
  private static boolean dotted_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dotted_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dotted_name_1", c)) break;
    }
    return true;
  }

  // '.' NAME
  private static boolean dotted_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotted_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME
  public static boolean encoding_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "encoding_decl")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    exit_section_(b, m, ENCODING_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // testlist NEWLINE* ENDMARKER
  public static boolean eval_input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eval_input")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVAL_INPUT, "<eval input>");
    r = testlist(b, l + 1);
    r = r && eval_input_1(b, l + 1);
    r = r && consumeToken(b, ENDMARKER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NEWLINE*
  private static boolean eval_input_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eval_input_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NEWLINE)) break;
      if (!empty_element_parsed_guard_(b, "eval_input_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'إلا' [test ['مثل' NAME]]
  public static boolean except_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCEPT_CLAUSE, "<except clause>");
    r = consumeToken(b, "إلا");
    r = r && except_clause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [test ['مثل' NAME]]
  private static boolean except_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_clause_1")) return false;
    except_clause_1_0(b, l + 1);
    return true;
  }

  // test ['مثل' NAME]
  private static boolean except_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && except_clause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['مثل' NAME]
  private static boolean except_clause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_clause_1_0_1")) return false;
    except_clause_1_0_1_0(b, l + 1);
    return true;
  }

  // 'مثل' NAME
  private static boolean except_clause_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "except_clause_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "مثل");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xor_expr ('|' xor_expr)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = xor_expr(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('|' xor_expr)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // '|' xor_expr
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && xor_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // testlist_star_expr (annassign | augassign (yield_expr|testlist) |
  //                      ('=' (yield_expr|testlist_star_expr))*)
  public static boolean expr_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = testlist_star_expr(b, l + 1);
    r = r && expr_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annassign | augassign (yield_expr|testlist) |
  //                      ('=' (yield_expr|testlist_star_expr))*
  private static boolean expr_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annassign(b, l + 1);
    if (!r) r = expr_stmt_1_1(b, l + 1);
    if (!r) r = expr_stmt_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // augassign (yield_expr|testlist)
  private static boolean expr_stmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = augassign(b, l + 1);
    r = r && expr_stmt_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // yield_expr|testlist
  private static boolean expr_stmt_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_1")) return false;
    boolean r;
    r = yield_expr(b, l + 1);
    if (!r) r = testlist(b, l + 1);
    return r;
  }

  // ('=' (yield_expr|testlist_star_expr))*
  private static boolean expr_stmt_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_stmt_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_stmt_1_2", c)) break;
    }
    return true;
  }

  // '=' (yield_expr|testlist_star_expr)
  private static boolean expr_stmt_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && expr_stmt_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // yield_expr|testlist_star_expr
  private static boolean expr_stmt_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_2_0_1")) return false;
    boolean r;
    r = yield_expr(b, l + 1);
    if (!r) r = testlist_star_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (expr|star_expr) (',' (expr|star_expr))* [',']
  public static boolean exprlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRLIST, "<exprlist>");
    r = exprlist_0(b, l + 1);
    r = r && exprlist_1(b, l + 1);
    r = r && exprlist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr|star_expr
  private static boolean exprlist_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist_0")) return false;
    boolean r;
    r = expr(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // (',' (expr|star_expr))*
  private static boolean exprlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exprlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprlist_1", c)) break;
    }
    return true;
  }

  // ',' (expr|star_expr)
  private static boolean exprlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exprlist_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr|star_expr
  private static boolean exprlist_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist_1_0_1")) return false;
    boolean r;
    r = expr(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // [',']
  private static boolean exprlist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprlist_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // ('+'|'-'|'~') factor | power
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, FACTOR, "<factor>");
    r = factor_0(b, l + 1);
    if (!r) r = power(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('+'|'-'|'~') factor
  private static boolean factor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = factor_0_0(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'|'-'|'~'
  private static boolean factor_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "~");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (NEWLINE | stmt)* ENDMARKER
  public static boolean file_input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_input")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_INPUT, "<file input>");
    r = file_input_0(b, l + 1);
    r = r && consumeToken(b, ENDMARKER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NEWLINE | stmt)*
  private static boolean file_input_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_input_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_input_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_input_0", c)) break;
    }
    return true;
  }

  // NEWLINE | stmt
  private static boolean file_input_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_input_0_0")) return false;
    boolean r;
    r = consumeToken(b, NEWLINE);
    if (!r) r = stmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt
  public static boolean flow_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flow_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOW_STMT, "<flow stmt>");
    r = break_stmt(b, l + 1);
    if (!r) r = continue_stmt(b, l + 1);
    if (!r) r = return_stmt(b, l + 1);
    if (!r) r = raise_stmt(b, l + 1);
    if (!r) r = yield_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'لأن' exprlist 'في' testlist ':' suite ['آخر' ':' suite]
  public static boolean for_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, "<for stmt>");
    r = consumeToken(b, "لأن");
    r = r && exprlist(b, l + 1);
    r = r && consumeToken(b, "في");
    r = r && testlist(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    r = r && for_stmt_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['آخر' ':' suite]
  private static boolean for_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt_6")) return false;
    for_stmt_6_0(b, l + 1);
    return true;
  }

  // 'آخر' ':' suite
  private static boolean for_stmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "آخر");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'وظيفة' NAME parameters ['->' test] ':' suite
  public static boolean funcdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCDEF, "<funcdef>");
    r = consumeToken(b, "وظيفة");
    r = r && consumeToken(b, NAME);
    r = r && parameters(b, l + 1);
    r = r && funcdef_3(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['->' test]
  private static boolean funcdef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcdef_3")) return false;
    funcdef_3_0(b, l + 1);
    return true;
  }

  // '->' test
  private static boolean funcdef_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcdef_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'عالمي' NAME (',' NAME)*
  public static boolean global_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_STMT, "<global stmt>");
    r = consumeToken(b, "عالمي");
    r = r && consumeToken(b, NAME);
    r = r && global_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' NAME)*
  private static boolean global_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_stmt_2", c)) break;
    }
    return true;
  }

  // ',' NAME
  private static boolean global_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'لو' test ':' suite ('ولو' test ':' suite)* ['آخر' ':' suite]
  public static boolean if_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "لو");
    r = r && test(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    r = r && if_stmt_4(b, l + 1);
    r = r && if_stmt_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('ولو' test ':' suite)*
  private static boolean if_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_stmt_4", c)) break;
    }
    return true;
  }

  // 'ولو' test ':' suite
  private static boolean if_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ولو");
    r = r && test(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['آخر' ':' suite]
  private static boolean if_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5")) return false;
    if_stmt_5_0(b, l + 1);
    return true;
  }

  // 'آخر' ':' suite
  private static boolean if_stmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "آخر");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME ['as' NAME]
  public static boolean import_as_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_name")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && import_as_name_1(b, l + 1);
    exit_section_(b, m, IMPORT_AS_NAME, r);
    return r;
  }

  // ['as' NAME]
  private static boolean import_as_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_name_1")) return false;
    import_as_name_1_0(b, l + 1);
    return true;
  }

  // 'as' NAME
  private static boolean import_as_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // import_as_name (',' import_as_name)* [',']
  public static boolean import_as_names(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_names")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_as_name(b, l + 1);
    r = r && import_as_names_1(b, l + 1);
    r = r && import_as_names_2(b, l + 1);
    exit_section_(b, m, IMPORT_AS_NAMES, r);
    return r;
  }

  // (',' import_as_name)*
  private static boolean import_as_names_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_names_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_as_names_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_as_names_1", c)) break;
    }
    return true;
  }

  // ',' import_as_name
  private static boolean import_as_names_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_names_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && import_as_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean import_as_names_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as_names_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // 'من' (('.' | '...')* dotted_name | ('.' | '...')+)
  //               'استيراد' ('*' | '(' import_as_names ')' | import_as_names)
  public static boolean import_from(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_FROM, "<import from>");
    r = consumeToken(b, "من");
    r = r && import_from_1(b, l + 1);
    r = r && consumeToken(b, "استيراد");
    r = r && import_from_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('.' | '...')* dotted_name | ('.' | '...')+
  private static boolean import_from_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_from_1_0(b, l + 1);
    if (!r) r = import_from_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' | '...')* dotted_name
  private static boolean import_from_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_from_1_0_0(b, l + 1);
    r = r && dotted_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' | '...')*
  private static boolean import_from_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_from_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_from_1_0_0", c)) break;
    }
    return true;
  }

  // '.' | '...'
  private static boolean import_from_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "...");
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' | '...')+
  private static boolean import_from_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_from_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!import_from_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_from_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' | '...'
  private static boolean import_from_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "...");
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '(' import_as_names ')' | import_as_names
  private static boolean import_from_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = import_from_3_1(b, l + 1);
    if (!r) r = import_as_names(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' import_as_names ')'
  private static boolean import_from_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_from_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && import_as_names(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'استيراد' dotted_as_names
  public static boolean import_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_NAME, "<import name>");
    r = consumeToken(b, "استيراد");
    r = r && dotted_as_names(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // import_name | import_from
  public static boolean import_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = import_name(b, l + 1);
    if (!r) r = import_from(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF|single_input|file_input|eval_input
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = single_input(b, l + 1);
    if (!r) r = file_input(b, l + 1);
    if (!r) r = eval_input(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'امدا' [varargslist] ':' test
  public static boolean lambdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDEF, "<lambdef>");
    r = consumeToken(b, "امدا");
    r = r && lambdef_1(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && test(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [varargslist]
  private static boolean lambdef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdef_1")) return false;
    varargslist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'امدا' [varargslist] ':' test_nocond
  public static boolean lambdef_nocond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdef_nocond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDEF_NOCOND, "<lambdef nocond>");
    r = consumeToken(b, "امدا");
    r = r && lambdef_nocond_1(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && test_nocond(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [varargslist]
  private static boolean lambdef_nocond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdef_nocond_1")) return false;
    varargslist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'غيرمحلي' NAME (',' NAME)*
  public static boolean nonlocal_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonlocal_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NONLOCAL_STMT, "<nonlocal stmt>");
    r = consumeToken(b, "غيرمحلي");
    r = r && consumeToken(b, NAME);
    r = r && nonlocal_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' NAME)*
  private static boolean nonlocal_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonlocal_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nonlocal_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nonlocal_stmt_2", c)) break;
    }
    return true;
  }

  // ',' NAME
  private static boolean nonlocal_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonlocal_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'لا' not_test | comparison
  public static boolean not_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_test")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_TEST, "<not test>");
    r = not_test_0(b, l + 1);
    if (!r) r = comparison(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'لا' not_test
  private static boolean not_test_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_test_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "لا");
    r = r && not_test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and_test ('أو' and_test)*
  public static boolean or_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_test")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_TEST, "<or test>");
    r = and_test(b, l + 1);
    r = r && or_test_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('أو' and_test)*
  private static boolean or_test_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_test_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!or_test_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_test_1", c)) break;
    }
    return true;
  }

  // 'أو' and_test
  private static boolean or_test_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_test_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "أو");
    r = r && and_test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' [typedargslist] ')'
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETERS, "<parameters>");
    r = consumeToken(b, "(");
    r = r && parameters_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [typedargslist]
  private static boolean parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1")) return false;
    typedargslist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'مرر'
  public static boolean pass_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pass_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PASS_STMT, "<pass stmt>");
    r = consumeToken(b, "مرر");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // atom_expr ['**' factor]
  public static boolean power(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "power")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POWER, "<power>");
    r = atom_expr(b, l + 1);
    r = r && power_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['**' factor]
  private static boolean power_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "power_1")) return false;
    power_1_0(b, l + 1);
    return true;
  }

  // '**' factor
  private static boolean power_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "power_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", KEY, SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, KEY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  /* ********************************************************** */
  // 'رفع' [test ['من' test]]
  public static boolean raise_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, "<raise stmt>");
    r = consumeToken(b, "رفع");
    r = r && raise_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [test ['من' test]]
  private static boolean raise_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt_1")) return false;
    raise_stmt_1_0(b, l + 1);
    return true;
  }

  // test ['من' test]
  private static boolean raise_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = test(b, l + 1);
    r = r && raise_stmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['من' test]
  private static boolean raise_stmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt_1_0_1")) return false;
    raise_stmt_1_0_1_0(b, l + 1);
    return true;
  }

  // 'من' test
  private static boolean raise_stmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "من");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'إرجع' [testlist]
  public static boolean return_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = consumeToken(b, "إرجع");
    r = r && return_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [testlist]
  private static boolean return_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt_1")) return false;
    testlist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // arith_expr (('<<'|'>>') arith_expr)*
  public static boolean shift_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPR, "<shift expr>");
    r = arith_expr(b, l + 1);
    r = r && shift_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('<<'|'>>') arith_expr)*
  private static boolean shift_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shift_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expr_1", c)) break;
    }
    return true;
  }

  // ('<<'|'>>') arith_expr
  private static boolean shift_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expr_1_0_0(b, l + 1);
    r = r && arith_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<'|'>>'
  private static boolean shift_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // small_stmt (';' small_stmt)* [';'] NEWLINE
  public static boolean simple_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
    r = small_stmt(b, l + 1);
    r = r && simple_stmt_1(b, l + 1);
    r = r && simple_stmt_2(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (';' small_stmt)*
  private static boolean simple_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_stmt_1", c)) break;
    }
    return true;
  }

  // ';' small_stmt
  private static boolean simple_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && small_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [';']
  private static boolean simple_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt_2")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // NEWLINE | simple_stmt | compound_stmt NEWLINE
  public static boolean single_input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_input")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_INPUT, "<single input>");
    r = consumeToken(b, NEWLINE);
    if (!r) r = simple_stmt(b, l + 1);
    if (!r) r = single_input_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // compound_stmt NEWLINE
  private static boolean single_input_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_input_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compound_stmt(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' [test]
  public static boolean sliceop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICEOP, "<sliceop>");
    r = consumeToken(b, ":");
    r = r && sliceop_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [test]
  private static boolean sliceop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceop_1")) return false;
    test(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr_stmt | del_stmt | pass_stmt | flow_stmt |
  //              import_stmt | global_stmt | nonlocal_stmt | assert_stmt
  public static boolean small_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "small_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SMALL_STMT, "<small stmt>");
    r = expr_stmt(b, l + 1);
    if (!r) r = del_stmt(b, l + 1);
    if (!r) r = pass_stmt(b, l + 1);
    if (!r) r = flow_stmt(b, l + 1);
    if (!r) r = import_stmt(b, l + 1);
    if (!r) r = global_stmt(b, l + 1);
    if (!r) r = nonlocal_stmt(b, l + 1);
    if (!r) r = assert_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*' expr
  public static boolean star_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "star_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STAR_EXPR, "<star expr>");
    r = consumeToken(b, "*");
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_stmt | compound_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = simple_stmt(b, l + 1);
    if (!r) r = compound_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // test | [test] ':' [test] [sliceop]
  public static boolean subscript(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBSCRIPT, "<subscript>");
    r = test(b, l + 1);
    if (!r) r = subscript_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [test] ':' [test] [sliceop]
  private static boolean subscript_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subscript_1_0(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && subscript_1_2(b, l + 1);
    r = r && subscript_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [test]
  private static boolean subscript_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_1_0")) return false;
    test(b, l + 1);
    return true;
  }

  // [test]
  private static boolean subscript_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_1_2")) return false;
    test(b, l + 1);
    return true;
  }

  // [sliceop]
  private static boolean subscript_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_1_3")) return false;
    sliceop(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subscript (',' subscript)* [',']
  public static boolean subscriptlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscriptlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBSCRIPTLIST, "<subscriptlist>");
    r = subscript(b, l + 1);
    r = r && subscriptlist_1(b, l + 1);
    r = r && subscriptlist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' subscript)*
  private static boolean subscriptlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscriptlist_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subscriptlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subscriptlist_1", c)) break;
    }
    return true;
  }

  // ',' subscript
  private static boolean subscriptlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscriptlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && subscript(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean subscriptlist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscriptlist_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // simple_stmt | NEWLINE INDENT stmt+ DEDENT
  public static boolean suite(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suite")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUITE, "<suite>");
    r = simple_stmt(b, l + 1);
    if (!r) r = suite_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NEWLINE INDENT stmt+ DEDENT
  private static boolean suite_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suite_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEWLINE, INDENT);
    r = r && suite_1_2(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // stmt+
  private static boolean suite_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suite_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "suite_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'لأن' exprlist 'في' or_test [comp_iter]
  public static boolean sync_comp_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sync_comp_for")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNC_COMP_FOR, "<sync comp for>");
    r = consumeToken(b, "لأن");
    r = r && exprlist(b, l + 1);
    r = r && consumeToken(b, "في");
    r = r && or_test(b, l + 1);
    r = r && sync_comp_for_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [comp_iter]
  private static boolean sync_comp_for_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sync_comp_for_4")) return false;
    comp_iter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // factor (('*'|'@'|'/'|'%'|'//') factor)*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('*'|'@'|'/'|'%'|'//') factor)*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // ('*'|'@'|'/'|'%'|'//') factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term_1_0_0(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|'@'|'/'|'%'|'//'
  private static boolean term_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "//");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // or_test ['لو' or_test 'آخر' test] | lambdef
  public static boolean test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST, "<test>");
    r = test_0(b, l + 1);
    if (!r) r = lambdef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // or_test ['لو' or_test 'آخر' test]
  private static boolean test_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_test(b, l + 1);
    r = r && test_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['لو' or_test 'آخر' test]
  private static boolean test_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_0_1")) return false;
    test_0_1_0(b, l + 1);
    return true;
  }

  // 'لو' or_test 'آخر' test
  private static boolean test_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "لو");
    r = r && or_test(b, l + 1);
    r = r && consumeToken(b, "آخر");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // or_test | lambdef_nocond
  public static boolean test_nocond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_nocond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_NOCOND, "<test nocond>");
    r = or_test(b, l + 1);
    if (!r) r = lambdef_nocond(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // test (',' test)* [',']
  public static boolean testlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TESTLIST, "<testlist>");
    r = test(b, l + 1);
    r = r && testlist_1(b, l + 1);
    r = r && testlist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' test)*
  private static boolean testlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!testlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "testlist_1", c)) break;
    }
    return true;
  }

  // ',' test
  private static boolean testlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean testlist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // (test|star_expr) ( comp_for | (',' (test|star_expr))* [','] )
  public static boolean testlist_comp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TESTLIST_COMP, "<testlist comp>");
    r = testlist_comp_0(b, l + 1);
    r = r && testlist_comp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // test|star_expr
  private static boolean testlist_comp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_0")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // comp_for | (',' (test|star_expr))* [',']
  private static boolean testlist_comp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comp_for(b, l + 1);
    if (!r) r = testlist_comp_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test|star_expr))* [',']
  private static boolean testlist_comp_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = testlist_comp_1_1_0(b, l + 1);
    r = r && testlist_comp_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (test|star_expr))*
  private static boolean testlist_comp_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!testlist_comp_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "testlist_comp_1_1_0", c)) break;
    }
    return true;
  }

  // ',' (test|star_expr)
  private static boolean testlist_comp_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && testlist_comp_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test|star_expr
  private static boolean testlist_comp_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1_1_0_0_1")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // [',']
  private static boolean testlist_comp_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_comp_1_1_1")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // (test|star_expr) (',' (test|star_expr))* [',']
  public static boolean testlist_star_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TESTLIST_STAR_EXPR, "<testlist star expr>");
    r = testlist_star_expr_0(b, l + 1);
    r = r && testlist_star_expr_1(b, l + 1);
    r = r && testlist_star_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // test|star_expr
  private static boolean testlist_star_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr_0")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // (',' (test|star_expr))*
  private static boolean testlist_star_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!testlist_star_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "testlist_star_expr_1", c)) break;
    }
    return true;
  }

  // ',' (test|star_expr)
  private static boolean testlist_star_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && testlist_star_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // test|star_expr
  private static boolean testlist_star_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr_1_0_1")) return false;
    boolean r;
    r = test(b, l + 1);
    if (!r) r = star_expr(b, l + 1);
    return r;
  }

  // [',']
  private static boolean testlist_star_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testlist_star_expr_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // NAME [':' test]
  public static boolean tfpdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tfpdef")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && tfpdef_1(b, l + 1);
    exit_section_(b, m, TFPDEF, r);
    return r;
  }

  // [':' test]
  private static boolean tfpdef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tfpdef_1")) return false;
    tfpdef_1_0(b, l + 1);
    return true;
  }

  // ':' test
  private static boolean tfpdef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tfpdef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' [arglist] ')' | '[' subscriptlist ']' | '.' NAME
  public static boolean trailer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAILER, "<trailer>");
    r = trailer_0(b, l + 1);
    if (!r) r = trailer_1(b, l + 1);
    if (!r) r = trailer_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' [arglist] ')'
  private static boolean trailer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && trailer_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [arglist]
  private static boolean trailer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailer_0_1")) return false;
    arglist(b, l + 1);
    return true;
  }

  // '[' subscriptlist ']'
  private static boolean trailer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && subscriptlist(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' NAME
  private static boolean trailer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailer_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'حاول' ':' suite
  //            ((except_clause ':' suite)+
  //             ['آخر' ':' suite]
  //             ['أخيرا' ':' suite] |
  //            'أخيرا' ':' suite)
  public static boolean try_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, "<try stmt>");
    r = consumeToken(b, "حاول");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    r = r && try_stmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (except_clause ':' suite)+
  //             ['آخر' ':' suite]
  //             ['أخيرا' ':' suite] |
  //            'أخيرا' ':' suite
  private static boolean try_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_stmt_3_0(b, l + 1);
    if (!r) r = try_stmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (except_clause ':' suite)+
  //             ['آخر' ':' suite]
  //             ['أخيرا' ':' suite]
  private static boolean try_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_stmt_3_0_0(b, l + 1);
    r = r && try_stmt_3_0_1(b, l + 1);
    r = r && try_stmt_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (except_clause ':' suite)+
  private static boolean try_stmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_stmt_3_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!try_stmt_3_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "try_stmt_3_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // except_clause ':' suite
  private static boolean try_stmt_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = except_clause(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['آخر' ':' suite]
  private static boolean try_stmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_1")) return false;
    try_stmt_3_0_1_0(b, l + 1);
    return true;
  }

  // 'آخر' ':' suite
  private static boolean try_stmt_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "آخر");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['أخيرا' ':' suite]
  private static boolean try_stmt_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_2")) return false;
    try_stmt_3_0_2_0(b, l + 1);
    return true;
  }

  // 'أخيرا' ':' suite
  private static boolean try_stmt_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "أخيرا");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'أخيرا' ':' suite
  private static boolean try_stmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "أخيرا");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tfpdef ['=' test] (',' tfpdef ['=' test])* [',' [
  //         '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']]]
  //   | '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //   | '**' tfpdef [',']
  public static boolean typedargslist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEDARGSLIST, "<typedargslist>");
    r = typedargslist_0(b, l + 1);
    if (!r) r = typedargslist_1(b, l + 1);
    if (!r) r = typedargslist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tfpdef ['=' test] (',' tfpdef ['=' test])* [',' [
  //         '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']]]
  private static boolean typedargslist_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tfpdef(b, l + 1);
    r = r && typedargslist_0_1(b, l + 1);
    r = r && typedargslist_0_2(b, l + 1);
    r = r && typedargslist_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean typedargslist_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_1")) return false;
    typedargslist_0_1_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean typedargslist_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' tfpdef ['=' test])*
  private static boolean typedargslist_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typedargslist_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typedargslist_0_2", c)) break;
    }
    return true;
  }

  // ',' tfpdef ['=' test]
  private static boolean typedargslist_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean typedargslist_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_2_0_2")) return false;
    typedargslist_0_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean typedargslist_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' [
  //         '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']]]
  private static boolean typedargslist_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3")) return false;
    typedargslist_0_3_0(b, l + 1);
    return true;
  }

  // ',' [
  //         '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']]
  private static boolean typedargslist_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && typedargslist_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [
  //         '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']]
  private static boolean typedargslist_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1")) return false;
    typedargslist_0_3_0_1_0(b, l + 1);
    return true;
  }

  // '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  //       | '**' tfpdef [',']
  private static boolean typedargslist_0_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedargslist_0_3_0_1_0_0(b, l + 1);
    if (!r) r = typedargslist_0_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  private static boolean typedargslist_0_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && typedargslist_0_3_0_1_0_0_1(b, l + 1);
    r = r && typedargslist_0_3_0_1_0_0_2(b, l + 1);
    r = r && typedargslist_0_3_0_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [tfpdef]
  private static boolean typedargslist_0_3_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_1")) return false;
    tfpdef(b, l + 1);
    return true;
  }

  // (',' tfpdef ['=' test])*
  private static boolean typedargslist_0_3_0_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typedargslist_0_3_0_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typedargslist_0_3_0_1_0_0_2", c)) break;
    }
    return true;
  }

  // ',' tfpdef ['=' test]
  private static boolean typedargslist_0_3_0_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_0_3_0_1_0_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean typedargslist_0_3_0_1_0_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_2_0_2")) return false;
    typedargslist_0_3_0_1_0_0_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean typedargslist_0_3_0_1_0_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' ['**' tfpdef [',']]]
  private static boolean typedargslist_0_3_0_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_3")) return false;
    typedargslist_0_3_0_1_0_0_3_0(b, l + 1);
    return true;
  }

  // ',' ['**' tfpdef [',']]
  private static boolean typedargslist_0_3_0_1_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && typedargslist_0_3_0_1_0_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['**' tfpdef [',']]
  private static boolean typedargslist_0_3_0_1_0_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_3_0_1")) return false;
    typedargslist_0_3_0_1_0_0_3_0_1_0(b, l + 1);
    return true;
  }

  // '**' tfpdef [',']
  private static boolean typedargslist_0_3_0_1_0_0_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_0_3_0_1_0_0_3_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean typedargslist_0_3_0_1_0_0_3_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_0_3_0_1_0_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '**' tfpdef [',']
  private static boolean typedargslist_0_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_0_3_0_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean typedargslist_0_3_0_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_0_3_0_1_0_1_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '*' [tfpdef] (',' tfpdef ['=' test])* [',' ['**' tfpdef [',']]]
  private static boolean typedargslist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && typedargslist_1_1(b, l + 1);
    r = r && typedargslist_1_2(b, l + 1);
    r = r && typedargslist_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [tfpdef]
  private static boolean typedargslist_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_1")) return false;
    tfpdef(b, l + 1);
    return true;
  }

  // (',' tfpdef ['=' test])*
  private static boolean typedargslist_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typedargslist_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typedargslist_1_2", c)) break;
    }
    return true;
  }

  // ',' tfpdef ['=' test]
  private static boolean typedargslist_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean typedargslist_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_2_0_2")) return false;
    typedargslist_1_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean typedargslist_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' ['**' tfpdef [',']]]
  private static boolean typedargslist_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_3")) return false;
    typedargslist_1_3_0(b, l + 1);
    return true;
  }

  // ',' ['**' tfpdef [',']]
  private static boolean typedargslist_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && typedargslist_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['**' tfpdef [',']]
  private static boolean typedargslist_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_3_0_1")) return false;
    typedargslist_1_3_0_1_0(b, l + 1);
    return true;
  }

  // '**' tfpdef [',']
  private static boolean typedargslist_1_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_1_3_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean typedargslist_1_3_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_1_3_0_1_0_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '**' tfpdef [',']
  private static boolean typedargslist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && tfpdef(b, l + 1);
    r = r && typedargslist_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean typedargslist_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedargslist_2_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // vfpdef ['=' test] (',' vfpdef ['=' test])* [',' [
  //         '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']]]
  //   | '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //   | '**' vfpdef [',']
  public static boolean varargslist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARARGSLIST, "<varargslist>");
    r = varargslist_0(b, l + 1);
    if (!r) r = varargslist_1(b, l + 1);
    if (!r) r = varargslist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // vfpdef ['=' test] (',' vfpdef ['=' test])* [',' [
  //         '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']]]
  private static boolean varargslist_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vfpdef(b, l + 1);
    r = r && varargslist_0_1(b, l + 1);
    r = r && varargslist_0_2(b, l + 1);
    r = r && varargslist_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean varargslist_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_1")) return false;
    varargslist_0_1_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean varargslist_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' vfpdef ['=' test])*
  private static boolean varargslist_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varargslist_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varargslist_0_2", c)) break;
    }
    return true;
  }

  // ',' vfpdef ['=' test]
  private static boolean varargslist_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean varargslist_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_2_0_2")) return false;
    varargslist_0_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean varargslist_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' [
  //         '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']]]
  private static boolean varargslist_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3")) return false;
    varargslist_0_3_0(b, l + 1);
    return true;
  }

  // ',' [
  //         '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']]
  private static boolean varargslist_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && varargslist_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [
  //         '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']]
  private static boolean varargslist_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1")) return false;
    varargslist_0_3_0_1_0(b, l + 1);
    return true;
  }

  // '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  //       | '**' vfpdef [',']
  private static boolean varargslist_0_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varargslist_0_3_0_1_0_0(b, l + 1);
    if (!r) r = varargslist_0_3_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  private static boolean varargslist_0_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && varargslist_0_3_0_1_0_0_1(b, l + 1);
    r = r && varargslist_0_3_0_1_0_0_2(b, l + 1);
    r = r && varargslist_0_3_0_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [vfpdef]
  private static boolean varargslist_0_3_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_1")) return false;
    vfpdef(b, l + 1);
    return true;
  }

  // (',' vfpdef ['=' test])*
  private static boolean varargslist_0_3_0_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varargslist_0_3_0_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varargslist_0_3_0_1_0_0_2", c)) break;
    }
    return true;
  }

  // ',' vfpdef ['=' test]
  private static boolean varargslist_0_3_0_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_0_3_0_1_0_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean varargslist_0_3_0_1_0_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_2_0_2")) return false;
    varargslist_0_3_0_1_0_0_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean varargslist_0_3_0_1_0_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' ['**' vfpdef [',']]]
  private static boolean varargslist_0_3_0_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_3")) return false;
    varargslist_0_3_0_1_0_0_3_0(b, l + 1);
    return true;
  }

  // ',' ['**' vfpdef [',']]
  private static boolean varargslist_0_3_0_1_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && varargslist_0_3_0_1_0_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['**' vfpdef [',']]
  private static boolean varargslist_0_3_0_1_0_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_3_0_1")) return false;
    varargslist_0_3_0_1_0_0_3_0_1_0(b, l + 1);
    return true;
  }

  // '**' vfpdef [',']
  private static boolean varargslist_0_3_0_1_0_0_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_0_3_0_1_0_0_3_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean varargslist_0_3_0_1_0_0_3_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_0_3_0_1_0_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '**' vfpdef [',']
  private static boolean varargslist_0_3_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_0_3_0_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean varargslist_0_3_0_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_0_3_0_1_0_1_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '*' [vfpdef] (',' vfpdef ['=' test])* [',' ['**' vfpdef [',']]]
  private static boolean varargslist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && varargslist_1_1(b, l + 1);
    r = r && varargslist_1_2(b, l + 1);
    r = r && varargslist_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [vfpdef]
  private static boolean varargslist_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_1")) return false;
    vfpdef(b, l + 1);
    return true;
  }

  // (',' vfpdef ['=' test])*
  private static boolean varargslist_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!varargslist_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "varargslist_1_2", c)) break;
    }
    return true;
  }

  // ',' vfpdef ['=' test]
  private static boolean varargslist_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['=' test]
  private static boolean varargslist_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_2_0_2")) return false;
    varargslist_1_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' test
  private static boolean varargslist_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' ['**' vfpdef [',']]]
  private static boolean varargslist_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_3")) return false;
    varargslist_1_3_0(b, l + 1);
    return true;
  }

  // ',' ['**' vfpdef [',']]
  private static boolean varargslist_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && varargslist_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['**' vfpdef [',']]
  private static boolean varargslist_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_3_0_1")) return false;
    varargslist_1_3_0_1_0(b, l + 1);
    return true;
  }

  // '**' vfpdef [',']
  private static boolean varargslist_1_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_1_3_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean varargslist_1_3_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_1_3_0_1_0_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  // '**' vfpdef [',']
  private static boolean varargslist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "**");
    r = r && vfpdef(b, l + 1);
    r = r && varargslist_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',']
  private static boolean varargslist_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varargslist_2_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // NAME
  public static boolean vfpdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vfpdef")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    exit_section_(b, m, VFPDEF, r);
    return r;
  }

  /* ********************************************************** */
  // 'بينما' test ':' suite ['آخر' ':' suite]
  public static boolean while_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "بينما");
    r = r && test(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    r = r && while_stmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['آخر' ':' suite]
  private static boolean while_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt_4")) return false;
    while_stmt_4_0(b, l + 1);
    return true;
  }

  // 'آخر' ':' suite
  private static boolean while_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "آخر");
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // test ['مثل' expr]
  public static boolean with_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_ITEM, "<with item>");
    r = test(b, l + 1);
    r = r && with_item_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['مثل' expr]
  private static boolean with_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_item_1")) return false;
    with_item_1_0(b, l + 1);
    return true;
  }

  // 'مثل' expr
  private static boolean with_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "مثل");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'مع' with_item (',' with_item)*  ':' suite
  public static boolean with_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_STMT, "<with stmt>");
    r = consumeToken(b, "مع");
    r = r && with_item(b, l + 1);
    r = r && with_stmt_2(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && suite(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' with_item)*
  private static boolean with_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!with_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "with_stmt_2", c)) break;
    }
    return true;
  }

  // ',' with_item
  private static boolean with_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && with_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and_expr ('^' and_expr)*
  public static boolean xor_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xor_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XOR_EXPR, "<xor expr>");
    r = and_expr(b, l + 1);
    r = r && xor_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('^' and_expr)*
  private static boolean xor_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xor_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xor_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xor_expr_1", c)) break;
    }
    return true;
  }

  // '^' and_expr
  private static boolean xor_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xor_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "^");
    r = r && and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean yaLangFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yaLangFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "yaLangFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'من' test | testlist
  public static boolean yield_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_ARG, "<yield arg>");
    r = yield_arg_0(b, l + 1);
    if (!r) r = testlist(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'من' test
  private static boolean yield_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_arg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "من");
    r = r && test(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'محصول' [yield_arg]
  public static boolean yield_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_EXPR, "<yield expr>");
    r = consumeToken(b, "محصول");
    r = r && yield_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [yield_arg]
  private static boolean yield_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expr_1")) return false;
    yield_arg(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // yield_expr
  public static boolean yield_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, "<yield stmt>");
    r = yield_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
package com.mozaic;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.psi.PsiElement;
import com.intellij.refactoring.listeners.RefactoringElementListener;
import com.intellij.refactoring.rename.RenameJavaMethodProcessor;
import com.intellij.usageView.UsageInfo;

public class ReadCurrentFile extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        ActionManager actionManager = ActionManager.getInstance();

        PsiElement psiElement = e.getData(LangDataKeys.PSI_ELEMENT);
        RefactoringElementListener refactoringElementListener = null;
        UsageInfo[] usageInfo = new UsageInfo[0];
        new RenameJavaMethodProcessor().renameElement(psiElement, "something", usageInfo, refactoringElementListener);

    }
}

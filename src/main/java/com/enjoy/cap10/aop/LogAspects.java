package com.enjoy.cap10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//��־������
@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.enjoy.cap10.aop.Calculator.*(..))")
    public void pointCut() {
    }

    //@before������Ŀ�귽��ִ��ǰ����, ��ָ�����ĸ�����ǰ����
    @Before("pointCut()")
    public void logStart() {
        System.out.println("��������....�����б���:{}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("��������......");

    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("������������......���н����:{}");
    }

    @AfterThrowing("pointCut()")
    public void logException() {
        System.out.println("�����쳣......�쳣��Ϣ��:{}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Arount:ִ��Ŀ�귽��֮ǰ...");
        Object obj = proceedingJoinPoint.proceed();//�൱�ڿ�ʼ��div��
        System.out.println("@Arount:ִ��Ŀ�귽��֮��...");
        return obj;
    }
}

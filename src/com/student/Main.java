package com.student;

public class Main {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();
        // 测试查询
        System.out.println("2024001 成绩：" + manager.getScoreByStudentId("2024001"));
        System.out.println("2024003 成绩：" + manager.getScoreByStudentId("2024003"));
    }
}
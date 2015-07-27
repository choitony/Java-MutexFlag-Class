package com.test;

import com.choi.MutexFlag;

public class Example implements Runnable {
	
	MutexFlag mutexFlag = new MutexFlag();
	
	@Override
	public void run() {
		mutexFlag.getMutexFalg();
		for(int i=0; i<5;i++){
			System.out.println("当前执行的线程是："+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		mutexFlag.freeMutexFlag();
	}

	public static void main(String[] args){
		Example runner = new Example();
		new Thread(runner,"ThreadOne").start();
		new Thread(runner,"ThreadTwo").start();
	}
}

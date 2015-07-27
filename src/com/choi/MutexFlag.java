package com.choi;

public class MutexFlag {

	protected Thread currentThread = null;
	protected int count = 0;

	public synchronized void getMutexFalg() {
		while (tryGetMutexFlag() == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized boolean tryGetMutexFlag() {
		if (currentThread == null) {
			currentThread = Thread.currentThread();
			count = 1;
			return true;
		}
		if (currentThread == Thread.currentThread()) {
			count++;
			return true;
		}
		return false;
	}

	public synchronized void freeMutexFlag() {
		if (currentThread == Thread.currentThread()) {
			count--;
		}
		if (count == 0) {
			currentThread = null;
			notify();
		}
	}
}

package com.forward.date20170508.facade;

public class Computer {
	CPU cpu;
	Memory memory;
	Disk disk;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup(){
		System.out.println("����Computer��");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("����Computer��over");
	}
	
	public void shutdown(){
		System.out.println("�ر�Computer��");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("�ر�Computer��over");
	}
}

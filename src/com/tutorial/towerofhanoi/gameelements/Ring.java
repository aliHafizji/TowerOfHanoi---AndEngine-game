package com.tutorial.towerofhanoi.gameelements;

import java.util.Stack;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class Ring extends Sprite {
	
	private int mWeight;
	private Stack<Ring> mStack; //this represents the stack that this ring belongs to
	private Sprite mTower;
	
	public Ring(int weight, float pX, float pY, ITextureRegion pTextureRegion, VertexBufferObjectManager pVertexBufferObjectManager) {
		super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
		this.mWeight = weight;
	}

	public int getmWeight() {
		return mWeight;
	}

	public Stack<Ring> getmStack() {
		return mStack;
	}

	public void setmStack(Stack<Ring> mStack) {
		this.mStack = mStack;
	}

	public Sprite getmTower() {
		return mTower;
	}

	public void setmTower(Sprite mTower) {
		this.mTower = mTower;
	}
}

package com.androsa.doiamornament;

import com.androsa.ornamental.builder.OrnamentBuilder;

public class TFOrnamentBuilder extends OrnamentBuilder {

	private final OrnamentBuilder builder;
	public boolean occlusion = true;
	public boolean emissive = false;
	public float shadeBrightness = -1.0F;
	public boolean shearable = false;
	public float shearSpeed = 1.0F;
	public boolean sticky = false;

	public TFOrnamentBuilder(OrnamentBuilder builder) {
		super(builder.name);
		this.builder = builder;
	}

	@Override
	public OrnamentBuilder getBuilder() {
		return builder;
	}

	/**
	 * Determines if a block does not have occlusion
	 */
	public TFOrnamentBuilder noOcclusionShape() {
		this.occlusion = false;
		return this;
	}

	/**
	 * Determines level of shade brightness. Negative values use default handling
	 */
	public TFOrnamentBuilder shadeBrightness(float level) {
		this.shadeBrightness = level;
		return this;
	}

	/**
	 * Determines if the tool uses Shears to harvest
	 */
	public TFOrnamentBuilder shearable(float speed) {
		this.shearable = true;
		this.shearSpeed = speed;
		return this;
	}

	/**
	 * Determines if the block sticks to other blocks
	 */
	public TFOrnamentBuilder sticky() {
		this.sticky = true;
		return this;
	}
}

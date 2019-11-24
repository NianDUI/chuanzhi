package com.test;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Material;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseWheelZoom;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class SimpleCube extends Applet {

	public BranchGroup createSceneGraph() {
		BranchGroup objRoot = new BranchGroup();

		TransformGroup trans = new TransformGroup();
		trans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		trans.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);

//加载正方体的六个面

//一个立方体
		Box box = new Box(0.4f, 0.4f, 0.4f, Box.GENERATE_TEXTURE_COORDS, new Appearance());

		objRoot.addChild(trans);
		trans.addChild(box);
//trans.addChild(cylin);

//鼠标的旋转
		MouseRotate myMouseRotate = new MouseRotate();
		myMouseRotate.setTransformGroup(trans);
		myMouseRotate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(myMouseRotate);

//鼠标的平移
		MouseTranslate translate = new MouseTranslate();
		translate.setTransformGroup(trans);
		translate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(translate);

//鼠标的放大
		MouseWheelZoom zoom = new MouseWheelZoom();
		zoom.setTransformGroup(trans);
		zoom.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(zoom);

		objRoot.compile();

		return objRoot;
	}

	public SimpleCube() {

		setLayout(new BorderLayout());
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3D = new Canvas3D(config);
		add("Center", canvas3D);

		BranchGroup scene = createSceneGraph();
		SimpleUniverse simpleU = new SimpleUniverse(canvas3D);

		simpleU.getViewingPlatform().setNominalViewingTransform();
		simpleU.addBranchGraph(scene);
	}

	public static void main(String[] args) {
		new MainFrame(new SimpleCube(), 500, 500);

	}
}
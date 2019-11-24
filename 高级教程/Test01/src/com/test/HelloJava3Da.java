package com.test;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.Alpha;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Group;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseWheelZoom;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class HelloJava3Da extends Applet {
	private static final long serialVersionUID = 1L;

	public HelloJava3Da() {
		setLayout(new BorderLayout());
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3D = new Canvas3D(config);
		add("Center", canvas3D);

		BranchGroup scene = createSceneGraph();
		scene.compile();

		// SimpleUniverse����һ���ܷ���Ĺ�����
		SimpleUniverse simpleU = new SimpleUniverse(canvas3D);

		// ���ViewPlatform������һ��㣬
		// ��ʹ�����еĶ����ܱ�������
		simpleU.getViewingPlatform().setNominalViewingTransform();

		simpleU.addBranchGraph(scene);
	} // HelloJava3Da (���캯��)����

	public BranchGroup createSceneGraph() {
		// ������֧��ͼ�ĸ����
		BranchGroup objRoot = new BranchGroup();
		// ����һ���򵥵�ͼ��Ҷ�ӽ�㣬������ӵ�����ͼ��
		// ColorCubeҲ��һ���ܷ���Ĺ�����

//		objRoot.addChild(new ColorCube(0.4));

		TransformGroup trans = new TransformGroup();
		trans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		trans.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);


//�����������������
//һ��������
		Box box = new Box(0.4f, 0.4f, 0.4f, Box.GENERATE_TEXTURE_COORDS, new Appearance());

//trans.addChild(cylin);
		trans.addChild(box);

		
		
		
		
		
		
		
		
		
		
		
		


	    // create a spherical bounding volume
	    BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),
	        100.0);

	    // create a 4x4 transformation matrix
	    Transform3D yAxis = new Transform3D();

	    // create an Alpha interpolator to automatically generate
	    // modifications to the rotation component of the transformation matrix
	    Alpha rotationAlpha = new Alpha(-1, Alpha.INCREASING_ENABLE, 0, 0,
	        4000, 0, 0, 0, 0, 0);

	    // create a RotationInterpolator behavior to effect the TransformGroup
	    RotationInterpolator rotator = new RotationInterpolator(rotationAlpha, trans, yAxis,
	        0.0f, (float) Math.PI * 2.0f);

	    // set the scheduling bounds on the behavior
	    rotator.setSchedulingBounds(bounds);

	    // add the behavior to the scenegraph
	    trans.addChild(rotator);

	    // create the colors for the lights
	    Color3f lColor1 = new Color3f(0.7f, 0.7f, 0.7f);
	    Vector3f lDir1 = new Vector3f(-1.0f, -1.0f, -1.0f);
	    Color3f alColor = new Color3f(0.2f, 0.2f, 0.2f);

	    // create the ambient light
	    AmbientLight aLgt = new AmbientLight(alColor);
	    aLgt.setInfluencingBounds(bounds);

	    // create the directional light
	    DirectionalLight lgt1 = new DirectionalLight(lColor1, lDir1);
	    lgt1.setInfluencingBounds(bounds);

	    // add the lights to the scenegraph
	    objRoot.addChild(aLgt);
	    objRoot.addChild(lgt1);
	    
	    
	    

		objRoot.addChild(trans);
	    
		
	    
//������ת
		MouseRotate myMouseRotate = new MouseRotate();
		myMouseRotate.setTransformGroup(trans);
		myMouseRotate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(myMouseRotate);

//����ƽ��
		MouseTranslate translate = new MouseTranslate();
		translate.setTransformGroup(trans);
		translate.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(translate);

//���ķŴ�
		MouseWheelZoom zoom = new MouseWheelZoom();
		zoom.setTransformGroup(trans);
		zoom.setSchedulingBounds(new BoundingSphere());
		objRoot.addChild(zoom);

		return objRoot;
	} // HelloJava3Da �Ĵ�������ͼ�ķ���createSceneGraph����

	public static void main(String[] args) {
		new MainFrame(new HelloJava3Da(), 500, 500);
	}

} // HelloJava3Da�����

package com.francesco.mod.client.model;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/** Generated from the original Francesco model: hull, front wing plates and four wheels. */
public final class FrancescoLayer {
	private FrancescoLayer() {
	}

	public static LayerDefinition create() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();
		PartDefinition p_car = root.addOrReplaceChild("car", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition p_hull = p_car.addOrReplaceChild("hull", cubes_hull(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition p_fw_plate_l = p_car.addOrReplaceChild("fw_plate_l", cubes_fw_plate_l(), PartPose.offsetAndRotation(-6.95F, -1.85F, -10.6F, 0.3142F, 0.0F, 0.0F));
		PartDefinition p_fw_plate_r = p_car.addOrReplaceChild("fw_plate_r", cubes_fw_plate_r(), PartPose.offsetAndRotation(6.95F, -1.85F, -10.6F, 0.3142F, 0.0F, 0.0F));
		PartDefinition p_wheel_fl = p_car.addOrReplaceChild("wheel_fl", cubes_wheel_fl(), PartPose.offset(-4.7F, -1.9F, -7.1F));
		PartDefinition p_wheel_fl_1 = p_wheel_fl.addOrReplaceChild("wheel_fl_1", cubes_wheel_fl_1(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition p_wheel_fl_2 = p_wheel_fl.addOrReplaceChild("wheel_fl_2", cubes_wheel_fl_2(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition p_wheel_fl_3 = p_wheel_fl.addOrReplaceChild("wheel_fl_3", cubes_wheel_fl_3(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition p_wheel_fr = p_car.addOrReplaceChild("wheel_fr", cubes_wheel_fr(), PartPose.offset(4.7F, -1.9F, -7.1F));
		PartDefinition p_wheel_fr_1 = p_wheel_fr.addOrReplaceChild("wheel_fr_1", cubes_wheel_fr_1(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition p_wheel_fr_2 = p_wheel_fr.addOrReplaceChild("wheel_fr_2", cubes_wheel_fr_2(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition p_wheel_fr_3 = p_wheel_fr.addOrReplaceChild("wheel_fr_3", cubes_wheel_fr_3(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition p_wheel_rl = p_car.addOrReplaceChild("wheel_rl", cubes_wheel_rl(), PartPose.offset(-5.5F, -2.05F, 8.8F));
		PartDefinition p_wheel_rl_1 = p_wheel_rl.addOrReplaceChild("wheel_rl_1", cubes_wheel_rl_1(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition p_wheel_rl_2 = p_wheel_rl.addOrReplaceChild("wheel_rl_2", cubes_wheel_rl_2(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition p_wheel_rl_3 = p_wheel_rl.addOrReplaceChild("wheel_rl_3", cubes_wheel_rl_3(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition p_wheel_rr = p_car.addOrReplaceChild("wheel_rr", cubes_wheel_rr(), PartPose.offset(5.5F, -2.05F, 8.8F));
		PartDefinition p_wheel_rr_1 = p_wheel_rr.addOrReplaceChild("wheel_rr_1", cubes_wheel_rr_1(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition p_wheel_rr_2 = p_wheel_rr.addOrReplaceChild("wheel_rr_2", cubes_wheel_rr_2(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition p_wheel_rr_3 = p_wheel_rr.addOrReplaceChild("wheel_rr_3", cubes_wheel_rr_3(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		return LayerDefinition.create(mesh, 224, 80);
	}

	private static CubeListBuilder cubes_hull() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(84, 54).addBox(-1.6928F, -2.0071F, -12.0F, 3.3856F, 0.3199F, 0.3F);
		b.texOffs(93, 54).addBox(-2.0214F, -2.327F, -12.0F, 4.0428F, 0.3199F, 0.3F);
		b.texOffs(103, 54).addBox(-2.0214F, -2.6469F, -12.0F, 4.0428F, 0.3199F, 0.3F);
		b.texOffs(113, 54).addBox(-1.6928F, -2.9668F, -12.0F, 3.3856F, 0.3199F, 0.3F);
		b.texOffs(122, 54).addBox(-1.9128F, -2.0213F, -11.7F, 3.8257F, 0.3597F, 0.3F);
		b.texOffs(132, 54).addBox(-2.2841F, -2.381F, -11.7F, 4.5683F, 0.3597F, 0.3F);
		b.texOffs(143, 54).addBox(-2.2841F, -2.7407F, -11.7F, 4.5683F, 0.3597F, 0.3F);
		b.texOffs(154, 54).addBox(-1.9128F, -3.1004F, -11.7F, 3.8257F, 0.3597F, 0.3F);
		b.texOffs(164, 54).addBox(-2.0695F, -2.0253F, -11.4F, 4.1391F, 0.387F, 0.3F);
		b.texOffs(174, 54).addBox(-2.4713F, -2.4124F, -11.4F, 4.9426F, 0.387F, 0.3F);
		b.texOffs(186, 54).addBox(-2.4713F, -2.7994F, -11.4F, 4.9426F, 0.387F, 0.3F);
		b.texOffs(198, 54).addBox(-2.0695F, -3.1864F, -11.4F, 4.1391F, 0.387F, 0.3F);
		b.texOffs(208, 54).addBox(-2.1911F, -2.0218F, -11.1F, 4.3823F, 0.4077F, 0.3F);
		b.texOffs(0, 57).addBox(-2.6165F, -2.4295F, -11.1F, 5.233F, 0.4077F, 0.3F);
		b.texOffs(13, 57).addBox(-2.6165F, -2.8372F, -11.1F, 5.233F, 0.4077F, 0.3F);
		b.texOffs(26, 57).addBox(-2.1911F, -3.2448F, -11.1F, 4.3823F, 0.4077F, 0.3F);
		b.texOffs(37, 57).addBox(-2.2799F, -2.0234F, -10.8F, 4.5599F, 0.423F, 0.3F);
		b.texOffs(48, 57).addBox(-2.7225F, -2.4464F, -10.8F, 5.445F, 0.423F, 0.3F);
		b.texOffs(61, 57).addBox(-2.7225F, -2.8694F, -10.8F, 5.445F, 0.423F, 0.3F);
		b.texOffs(74, 57).addBox(-2.2799F, -3.2924F, -10.8F, 4.5599F, 0.423F, 0.3F);
		b.texOffs(85, 57).addBox(-2.34F, -2.034F, -10.5F, 4.68F, 0.434F, 0.3F);
		b.texOffs(96, 57).addBox(-2.7942F, -2.4679F, -10.5F, 5.5885F, 0.434F, 0.3F);
		b.texOffs(109, 57).addBox(-2.7942F, -2.9019F, -10.5F, 5.5885F, 0.434F, 0.3F);
		b.texOffs(122, 57).addBox(-2.34F, -3.3359F, -10.5F, 4.68F, 0.434F, 0.3F);
		b.texOffs(133, 57).addBox(-2.3828F, -2.0421F, -10.2F, 4.7656F, 0.4421F, 0.2F);
		b.texOffs(144, 57).addBox(-2.8453F, -2.4841F, -10.2F, 5.6906F, 0.4421F, 0.2F);
		b.texOffs(157, 57).addBox(-2.8453F, -2.9262F, -10.2F, 5.6906F, 0.4421F, 0.2F);
		b.texOffs(170, 57).addBox(-2.3828F, -3.3682F, -10.2F, 4.7656F, 0.4421F, 0.2F);
		b.texOffs(181, 57).addBox(-2.4209F, -2.0503F, -10.0F, 4.8419F, 0.4503F, 0.35F);
		b.texOffs(193, 57).addBox(-2.8909F, -2.5006F, -10.0F, 5.7818F, 0.4503F, 0.35F);
		b.texOffs(207, 57).addBox(-2.8909F, -2.9509F, -10.0F, 5.7818F, 0.4503F, 0.35F);
		b.texOffs(0, 59).addBox(-2.4209F, -3.4012F, -10.0F, 4.8419F, 0.4503F, 0.35F);
		b.texOffs(12, 59).addBox(-2.4533F, -2.0603F, -9.65F, 4.9065F, 0.4603F, 0.35F);
		b.texOffs(24, 59).addBox(-2.9295F, -2.5207F, -9.65F, 5.859F, 0.4603F, 0.35F);
		b.texOffs(38, 59).addBox(-2.9295F, -2.981F, -9.65F, 5.859F, 0.4603F, 0.35F);
		b.texOffs(52, 59).addBox(-2.4533F, -3.4414F, -9.65F, 4.9065F, 0.4603F, 0.35F);
		b.texOffs(64, 59).addBox(-2.4706F, -2.0703F, -9.3F, 4.9411F, 0.4703F, 0.35F);
		b.texOffs(76, 59).addBox(-2.9501F, -2.5407F, -9.3F, 5.9002F, 0.4703F, 0.35F);
		b.texOffs(90, 59).addBox(-2.9501F, -3.011F, -9.3F, 5.9002F, 0.4703F, 0.35F);
		b.texOffs(104, 59).addBox(-2.4706F, -3.4814F, -9.3F, 4.9411F, 0.4703F, 0.35F);
		b.texOffs(116, 59).addBox(-2.4845F, -2.08F, -8.95F, 4.9691F, 0.48F, 0.35F);
		b.texOffs(128, 59).addBox(-2.9668F, -2.56F, -8.95F, 5.9337F, 0.48F, 0.35F);
		b.texOffs(142, 59).addBox(-2.9668F, -3.04F, -8.95F, 5.9337F, 0.48F, 0.35F);
		b.texOffs(156, 59).addBox(-2.4845F, -3.5199F, -8.95F, 4.9691F, 0.48F, 0.35F);
		b.texOffs(168, 59).addBox(-2.4945F, -2.0893F, -8.6F, 4.9889F, 0.4893F, 0.35F);
		b.texOffs(180, 59).addBox(-2.9787F, -2.5785F, -8.6F, 5.9573F, 0.4893F, 0.35F);
		b.texOffs(194, 59).addBox(-2.9787F, -3.0678F, -8.6F, 5.9573F, 0.4893F, 0.35F);
		b.texOffs(208, 59).addBox(-2.4945F, -3.557F, -8.6F, 4.9889F, 0.4893F, 0.35F);
		b.texOffs(0, 61).addBox(-2.499F, -2.0981F, -8.25F, 4.998F, 0.4981F, 0.35F);
		b.texOffs(12, 61).addBox(-2.9841F, -2.5963F, -8.25F, 5.9682F, 0.4981F, 0.35F);
		b.texOffs(26, 61).addBox(-2.9841F, -3.0944F, -8.25F, 5.9682F, 0.4981F, 0.35F);
		b.texOffs(40, 61).addBox(-2.499F, -3.5926F, -8.25F, 4.998F, 0.4981F, 0.35F);
		b.texOffs(52, 61).addBox(-2.4992F, -2.1066F, -7.9F, 4.9983F, 0.5066F, 0.35F);
		b.texOffs(64, 61).addBox(-2.9843F, -2.6133F, -7.9F, 5.9686F, 0.5066F, 0.35F);
		b.texOffs(78, 61).addBox(-2.9843F, -3.1199F, -7.9F, 5.9686F, 0.5066F, 0.35F);
		b.texOffs(92, 61).addBox(-2.4992F, -3.6265F, -7.9F, 4.9983F, 0.5066F, 0.35F);
		b.texOffs(104, 61).addBox(-2.4992F, -2.1148F, -7.55F, 4.9983F, 0.5148F, 0.35F);
		b.texOffs(116, 61).addBox(-2.9843F, -2.6295F, -7.55F, 5.9686F, 0.5148F, 0.35F);
		b.texOffs(130, 61).addBox(-2.9843F, -3.1443F, -7.55F, 5.9686F, 0.5148F, 0.35F);
		b.texOffs(144, 61).addBox(-2.4992F, -3.6591F, -7.55F, 4.9983F, 0.5148F, 0.35F);
		b.texOffs(156, 61).addBox(-2.4992F, -2.1226F, -7.2F, 4.9983F, 0.5226F, 0.35F);
		b.texOffs(168, 61).addBox(-2.9843F, -2.6453F, -7.2F, 5.9686F, 0.5226F, 0.35F);
		b.texOffs(182, 61).addBox(-2.9843F, -3.1679F, -7.2F, 5.9686F, 0.5226F, 0.35F);
		b.texOffs(196, 61).addBox(-2.4992F, -3.6905F, -7.2F, 4.9983F, 0.5226F, 0.35F);
		b.texOffs(208, 61).addBox(-2.4992F, -2.1303F, -6.85F, 4.9983F, 0.5303F, 0.35F);
		b.texOffs(0, 63).addBox(-2.9843F, -2.6606F, -6.85F, 5.9686F, 0.5303F, 0.35F);
		b.texOffs(14, 63).addBox(-2.9843F, -3.191F, -6.85F, 5.9686F, 0.5303F, 0.35F);
		b.texOffs(28, 63).addBox(-2.4992F, -3.7213F, -6.85F, 4.9983F, 0.5303F, 0.35F);
		b.texOffs(40, 63).addBox(-2.4992F, -2.1379F, -6.5F, 4.9983F, 0.5379F, 0.35F);
		b.texOffs(52, 63).addBox(-2.9843F, -2.6759F, -6.5F, 5.9686F, 0.5379F, 0.35F);
		b.texOffs(66, 63).addBox(-2.9843F, -3.2138F, -6.5F, 5.9686F, 0.5379F, 0.35F);
		b.texOffs(80, 63).addBox(-2.4992F, -3.7517F, -6.5F, 4.9983F, 0.5379F, 0.35F);
		b.texOffs(92, 63).addBox(-2.4991F, -2.1455F, -6.15F, 4.9983F, 0.5455F, 0.35F);
		b.texOffs(104, 63).addBox(-2.9843F, -2.6911F, -6.15F, 5.9685F, 0.5455F, 0.35F);
		b.texOffs(118, 63).addBox(-2.9843F, -3.2366F, -6.15F, 5.9685F, 0.5455F, 0.35F);
		b.texOffs(132, 63).addBox(-2.4991F, -3.7822F, -6.15F, 4.9983F, 0.5455F, 0.35F);
		b.texOffs(144, 63).addBox(-2.494F, -2.1523F, -5.8F, 4.9879F, 0.5523F, 0.35F);
		b.texOffs(156, 63).addBox(-2.9781F, -2.7047F, -5.8F, 5.9562F, 0.5523F, 0.35F);
		b.texOffs(170, 63).addBox(-2.9781F, -3.257F, -5.8F, 5.9562F, 0.5523F, 0.35F);
		b.texOffs(184, 63).addBox(-2.494F, -3.8094F, -5.8F, 4.9879F, 0.5523F, 0.35F);
		b.texOffs(196, 63).addBox(-2.4804F, -2.1583F, -5.45F, 4.9608F, 0.5583F, 0.35F);
		b.texOffs(208, 63).addBox(-2.9619F, -2.7166F, -5.45F, 5.9237F, 0.5583F, 0.35F);
		b.texOffs(0, 65).addBox(-2.9619F, -3.2749F, -5.45F, 5.9237F, 0.5583F, 0.35F);
		b.texOffs(14, 65).addBox(-2.4804F, -3.8332F, -5.45F, 4.9608F, 0.5583F, 0.35F);
		b.texOffs(26, 65).addBox(-2.4593F, -2.1643F, -5.1F, 4.9186F, 0.5643F, 0.35F);
		b.texOffs(38, 65).addBox(-2.9367F, -2.7287F, -5.1F, 5.8734F, 0.5643F, 0.35F);
		b.texOffs(52, 65).addBox(-2.9367F, -3.293F, -5.1F, 5.8734F, 0.5643F, 0.35F);
		b.texOffs(66, 65).addBox(-2.4593F, -3.8574F, -5.1F, 4.9186F, 0.5643F, 0.35F);
		b.texOffs(78, 65).addBox(-2.4316F, -2.1714F, -4.75F, 4.8632F, 0.5714F, 0.35F);
		b.texOffs(90, 65).addBox(-2.9036F, -2.7427F, -4.75F, 5.8073F, 0.5714F, 0.35F);
		b.texOffs(104, 65).addBox(-2.9036F, -3.3141F, -4.75F, 5.8073F, 0.5714F, 0.35F);
		b.texOffs(118, 65).addBox(-2.4316F, -3.8855F, -4.75F, 4.8632F, 0.5714F, 0.35F);
		b.texOffs(130, 65).addBox(-2.3982F, -2.1803F, -4.4F, 4.7965F, 0.5803F, 0.35F);
		b.texOffs(142, 65).addBox(-2.8638F, -2.7606F, -4.4F, 5.7276F, 0.5803F, 0.35F);
		b.texOffs(156, 65).addBox(-2.8638F, -3.3409F, -4.4F, 5.7276F, 0.5803F, 0.35F);
		b.texOffs(170, 65).addBox(-2.3982F, -3.9213F, -4.4F, 4.7965F, 0.5803F, 0.35F);
		b.texOffs(182, 65).addBox(-2.3541F, -2.1922F, -4.05F, 4.7083F, 0.5922F, 0.35F);
		b.texOffs(194, 65).addBox(-2.8111F, -2.7845F, -4.05F, 5.6222F, 0.5922F, 0.35F);
		b.texOffs(207, 65).addBox(-2.8111F, -3.3767F, -4.05F, 5.6222F, 0.5922F, 0.35F);
		b.texOffs(0, 67).addBox(-2.3541F, -3.969F, -4.05F, 4.7083F, 0.5922F, 0.35F);
		b.texOffs(12, 67).addBox(-2.2534F, -2.211F, -3.7F, 4.5068F, 0.611F, 0.35F);
		b.texOffs(23, 67).addBox(-2.6908F, -2.822F, -3.7F, 5.3816F, 0.611F, 0.35F);
		b.texOffs(36, 67).addBox(-2.6908F, -3.4331F, -3.7F, 5.3816F, 0.611F, 0.35F);
		b.texOffs(49, 67).addBox(-2.2534F, -4.0441F, -3.7F, 4.5068F, 0.611F, 0.35F);
		b.texOffs(60, 67).addBox(-2.1426F, -2.2415F, -3.35F, 4.2851F, 0.6415F, 0.35F);
		b.texOffs(71, 67).addBox(-2.5585F, -2.883F, -3.35F, 5.117F, 0.6415F, 0.35F);
		b.texOffs(83, 67).addBox(-2.5585F, -3.5245F, -3.35F, 5.117F, 0.6415F, 0.35F);
		b.texOffs(95, 67).addBox(-2.1426F, -4.166F, -3.35F, 4.2851F, 0.6415F, 0.35F);
		b.texOffs(132, 27).addBox(-2.0644F, -2.3371F, -3.0F, 4.1288F, 0.7371F, 0.35F);
		b.texOffs(142, 27).addBox(-2.4652F, -3.0742F, -3.0F, 4.9303F, 0.7371F, 0.35F);
		b.texOffs(154, 27).addBox(-2.4652F, -3.8113F, -3.0F, 4.9303F, 0.7371F, 0.35F);
		b.texOffs(166, 27).addBox(-2.0644F, -4.5484F, -3.0F, 4.1288F, 0.7371F, 0.35F);
		b.texOffs(176, 27).addBox(-1.9972F, -2.5171F, -2.65F, 3.9944F, 0.9171F, 0.35F);
		b.texOffs(186, 27).addBox(-2.3849F, -3.4342F, -2.65F, 4.7698F, 0.9171F, 0.35F);
		b.texOffs(198, 27).addBox(-2.3849F, -4.3513F, -2.65F, 4.7698F, 0.9171F, 0.35F);
		b.texOffs(210, 27).addBox(-1.9972F, -5.2683F, -2.65F, 3.9944F, 0.9171F, 0.35F);
		b.texOffs(0, 33).addBox(-1.9492F, -2.6243F, -2.3F, 3.8984F, 1.0243F, 0.35F);
		b.texOffs(10, 33).addBox(-2.3275F, -3.6486F, -2.3F, 4.6551F, 1.0243F, 0.35F);
		b.texOffs(22, 33).addBox(-2.3275F, -4.6729F, -2.3F, 4.6551F, 1.0243F, 0.35F);
		b.texOffs(34, 33).addBox(-1.9492F, -5.6972F, -2.3F, 3.8984F, 1.0243F, 0.35F);
		b.texOffs(44, 33).addBox(-1.9142F, -2.6704F, -1.95F, 3.8285F, 1.0704F, 0.35F);
		b.texOffs(54, 33).addBox(-2.2858F, -3.7409F, -1.95F, 4.5716F, 1.0704F, 0.35F);
		b.texOffs(65, 33).addBox(-2.2858F, -4.8113F, -1.95F, 4.5716F, 1.0704F, 0.35F);
		b.texOffs(76, 33).addBox(-1.9142F, -5.8817F, -1.95F, 3.8285F, 1.0704F, 0.35F);
		b.texOffs(86, 33).addBox(-1.8873F, -2.7012F, -1.6F, 3.7746F, 1.1012F, 0.35F);
		b.texOffs(96, 33).addBox(-2.2536F, -3.8024F, -1.6F, 4.5073F, 1.1012F, 0.35F);
		b.texOffs(107, 33).addBox(-2.2536F, -4.9036F, -1.6F, 4.5073F, 1.1012F, 0.35F);
		b.texOffs(118, 33).addBox(-1.8873F, -6.0048F, -1.6F, 3.7746F, 1.1012F, 0.35F);
		b.texOffs(128, 33).addBox(-1.8685F, -2.7168F, -1.25F, 3.737F, 1.1168F, 0.35F);
		b.texOffs(138, 33).addBox(-2.2312F, -3.8336F, -1.25F, 4.4624F, 1.1168F, 0.35F);
		b.texOffs(149, 33).addBox(-2.2312F, -4.9504F, -1.25F, 4.4624F, 1.1168F, 0.35F);
		b.texOffs(160, 33).addBox(-1.8685F, -6.0671F, -1.25F, 3.737F, 1.1168F, 0.35F);
		b.texOffs(170, 33).addBox(-1.8549F, -2.7273F, -0.9F, 3.7098F, 1.1273F, 0.35F);
		b.texOffs(180, 33).addBox(-2.2149F, -3.8545F, -0.9F, 4.4299F, 1.1273F, 0.35F);
		b.texOffs(191, 33).addBox(-2.2149F, -4.9818F, -0.9F, 4.4299F, 1.1273F, 0.35F);
		b.texOffs(202, 33).addBox(-1.8549F, -6.109F, -0.9F, 3.7098F, 1.1273F, 0.35F);
		b.texOffs(212, 33).addBox(-1.8439F, -2.7345F, -0.55F, 3.6878F, 1.1345F, 0.35F);
		b.texOffs(0, 36).addBox(-2.2018F, -3.8691F, -0.55F, 4.4036F, 1.1345F, 0.35F);
		b.texOffs(11, 36).addBox(-2.2018F, -5.0036F, -0.55F, 4.4036F, 1.1345F, 0.35F);
		b.texOffs(22, 36).addBox(-1.8439F, -6.1381F, -0.55F, 3.6878F, 1.1345F, 0.35F);
		b.texOffs(32, 36).addBox(-1.8335F, -2.7375F, -0.2F, 3.667F, 1.1375F, 0.35F);
		b.texOffs(42, 36).addBox(-2.1894F, -3.875F, -0.2F, 4.3788F, 1.1375F, 0.35F);
		b.texOffs(53, 36).addBox(-2.1894F, -5.0125F, -0.2F, 4.3788F, 1.1375F, 0.35F);
		b.texOffs(64, 36).addBox(-1.8335F, -6.1499F, -0.2F, 3.667F, 1.1375F, 0.35F);
		b.texOffs(74, 36).addBox(-1.8238F, -2.7346F, 0.15F, 3.6476F, 1.1346F, 0.35F);
		b.texOffs(83, 36).addBox(-2.1779F, -3.8691F, 0.15F, 4.3557F, 1.1346F, 0.35F);
		b.texOffs(94, 36).addBox(-2.1779F, -5.0037F, 0.15F, 4.3557F, 1.1346F, 0.35F);
		b.texOffs(105, 36).addBox(-1.8238F, -6.1382F, 0.15F, 3.6476F, 1.1346F, 0.35F);
		b.texOffs(114, 36).addBox(-1.8156F, -2.7263F, 0.5F, 3.6313F, 1.1263F, 0.35F);
		b.texOffs(123, 36).addBox(-2.1681F, -3.8527F, 0.5F, 4.3362F, 1.1263F, 0.35F);
		b.texOffs(134, 36).addBox(-2.1681F, -4.979F, 0.5F, 4.3362F, 1.1263F, 0.35F);
		b.texOffs(145, 36).addBox(-1.8156F, -6.1053F, 0.5F, 3.6313F, 1.1263F, 0.35F);
		b.texOffs(154, 36).addBox(-1.807F, -2.7152F, 0.85F, 3.614F, 1.1152F, 0.35F);
		b.texOffs(163, 36).addBox(-2.1578F, -3.8305F, 0.85F, 4.3156F, 1.1152F, 0.35F);
		b.texOffs(174, 36).addBox(-2.1578F, -4.9457F, 0.85F, 4.3156F, 1.1152F, 0.35F);
		b.texOffs(185, 36).addBox(-1.807F, -6.0609F, 0.85F, 3.614F, 1.1152F, 0.35F);
		b.texOffs(194, 36).addBox(-1.796F, -2.7037F, 1.2F, 3.5919F, 1.1037F, 0.35F);
		b.texOffs(203, 36).addBox(-2.1446F, -3.8075F, 1.2F, 4.2892F, 1.1037F, 0.35F);
		b.texOffs(0, 39).addBox(-2.1446F, -4.9112F, 1.2F, 4.2892F, 1.1037F, 0.35F);
		b.texOffs(11, 39).addBox(-1.796F, -6.015F, 1.2F, 3.5919F, 1.1037F, 0.35F);
		b.texOffs(20, 39).addBox(-1.7788F, -2.6937F, 1.55F, 3.5575F, 1.0937F, 0.35F);
		b.texOffs(29, 39).addBox(-2.1241F, -3.7873F, 1.55F, 4.2481F, 1.0937F, 0.35F);
		b.texOffs(40, 39).addBox(-2.1241F, -4.881F, 1.55F, 4.2481F, 1.0937F, 0.35F);
		b.texOffs(51, 39).addBox(-1.7788F, -5.9747F, 1.55F, 3.5575F, 1.0937F, 0.35F);
		b.texOffs(60, 39).addBox(-1.7507F, -2.6838F, 1.9F, 3.5015F, 1.0838F, 0.35F);
		b.texOffs(69, 39).addBox(-2.0906F, -3.7675F, 1.9F, 4.1811F, 1.0838F, 0.35F);
		b.texOffs(80, 39).addBox(-2.0906F, -4.8513F, 1.9F, 4.1811F, 1.0838F, 0.35F);
		b.texOffs(91, 39).addBox(-1.7507F, -5.9351F, 1.9F, 3.5015F, 1.0838F, 0.35F);
		b.texOffs(100, 39).addBox(-1.7172F, -2.6729F, 2.25F, 3.4344F, 1.0729F, 0.35F);
		b.texOffs(109, 39).addBox(-2.0505F, -3.7457F, 2.25F, 4.101F, 1.0729F, 0.35F);
		b.texOffs(119, 39).addBox(-2.0505F, -4.8186F, 2.25F, 4.101F, 1.0729F, 0.35F);
		b.texOffs(129, 39).addBox(-1.7172F, -5.8914F, 2.25F, 3.4344F, 1.0729F, 0.35F);
		b.texOffs(138, 39).addBox(-1.6842F, -2.6599F, 2.6F, 3.3684F, 1.0599F, 0.35F);
		b.texOffs(147, 39).addBox(-2.0111F, -3.7198F, 2.6F, 4.0222F, 1.0599F, 0.35F);
		b.texOffs(157, 39).addBox(-2.0111F, -4.7797F, 2.6F, 4.0222F, 1.0599F, 0.35F);
		b.texOffs(167, 39).addBox(-1.6842F, -5.8396F, 2.6F, 3.3684F, 1.0599F, 0.35F);
		b.texOffs(176, 39).addBox(-1.6573F, -2.6435F, 2.95F, 3.3145F, 1.0435F, 0.35F);
		b.texOffs(185, 39).addBox(-1.979F, -3.6871F, 2.95F, 3.9579F, 1.0435F, 0.35F);
		b.texOffs(195, 39).addBox(-1.979F, -4.7306F, 2.95F, 3.9579F, 1.0435F, 0.35F);
		b.texOffs(205, 39).addBox(-1.6573F, -5.7741F, 2.95F, 3.3145F, 1.0435F, 0.35F);
		b.texOffs(214, 39).addBox(-1.6338F, -2.6201F, 3.3F, 3.2677F, 1.0201F, 0.35F);
		b.texOffs(0, 42).addBox(-1.951F, -3.6401F, 3.3F, 3.902F, 1.0201F, 0.35F);
		b.texOffs(10, 42).addBox(-1.951F, -4.6602F, 3.3F, 3.902F, 1.0201F, 0.35F);
		b.texOffs(20, 42).addBox(-1.6338F, -5.6802F, 3.3F, 3.2677F, 1.0201F, 0.35F);
		b.texOffs(29, 42).addBox(-1.6119F, -2.5904F, 3.65F, 3.2238F, 0.9904F, 0.35F);
		b.texOffs(38, 42).addBox(-1.9248F, -3.5809F, 3.65F, 3.8496F, 0.9904F, 0.35F);
		b.texOffs(48, 42).addBox(-1.9248F, -4.5713F, 3.65F, 3.8496F, 0.9904F, 0.35F);
		b.texOffs(58, 42).addBox(-1.6119F, -5.5617F, 3.65F, 3.2238F, 0.9904F, 0.35F);
		b.texOffs(67, 42).addBox(-1.5908F, -2.5569F, 4.0F, 3.1816F, 0.9569F, 0.35F);
		b.texOffs(76, 42).addBox(-1.8996F, -3.5138F, 4.0F, 3.7992F, 0.9569F, 0.35F);
		b.texOffs(86, 42).addBox(-1.8996F, -4.4707F, 4.0F, 3.7992F, 0.9569F, 0.35F);
		b.texOffs(96, 42).addBox(-1.5908F, -5.4276F, 4.0F, 3.1816F, 0.9569F, 0.35F);
		b.texOffs(105, 42).addBox(-1.57F, -2.5216F, 4.35F, 3.14F, 0.9216F, 0.35F);
		b.texOffs(113, 42).addBox(-1.8748F, -3.4433F, 4.35F, 3.7496F, 0.9216F, 0.35F);
		b.texOffs(123, 42).addBox(-1.8748F, -4.3649F, 4.35F, 3.7496F, 0.9216F, 0.35F);
		b.texOffs(133, 42).addBox(-1.57F, -5.2865F, 4.35F, 3.14F, 0.9216F, 0.35F);
		b.texOffs(141, 42).addBox(-1.5489F, -2.4869F, 4.7F, 3.0978F, 0.8869F, 0.35F);
		b.texOffs(149, 42).addBox(-1.8496F, -3.3737F, 4.7F, 3.6991F, 0.8869F, 0.35F);
		b.texOffs(159, 42).addBox(-1.8496F, -4.2606F, 4.7F, 3.6991F, 0.8869F, 0.35F);
		b.texOffs(169, 42).addBox(-1.5489F, -5.1475F, 4.7F, 3.0978F, 0.8869F, 0.35F);
		b.texOffs(177, 42).addBox(-1.5271F, -2.4534F, 5.05F, 3.0542F, 0.8534F, 0.35F);
		b.texOffs(185, 42).addBox(-1.8235F, -3.3067F, 5.05F, 3.6471F, 0.8534F, 0.35F);
		b.texOffs(194, 42).addBox(-1.8235F, -4.1601F, 5.05F, 3.6471F, 0.8534F, 0.35F);
		b.texOffs(203, 42).addBox(-1.5271F, -5.0134F, 5.05F, 3.0542F, 0.8534F, 0.35F);
		b.texOffs(211, 42).addBox(-1.5052F, -2.4178F, 5.4F, 3.0105F, 0.8178F, 0.35F);
		b.texOffs(0, 45).addBox(-1.7974F, -3.2355F, 5.4F, 3.5948F, 0.8178F, 0.35F);
		b.texOffs(9, 45).addBox(-1.7974F, -4.0533F, 5.4F, 3.5948F, 0.8178F, 0.35F);
		b.texOffs(18, 45).addBox(-1.5052F, -4.8711F, 5.4F, 3.0105F, 0.8178F, 0.35F);
		b.texOffs(26, 45).addBox(-1.4834F, -2.381F, 5.75F, 2.9667F, 0.781F, 0.35F);
		b.texOffs(34, 45).addBox(-1.7713F, -3.162F, 5.75F, 3.5426F, 0.781F, 0.35F);
		b.texOffs(43, 45).addBox(-1.7713F, -3.943F, 5.75F, 3.5426F, 0.781F, 0.35F);
		b.texOffs(52, 45).addBox(-1.4834F, -4.724F, 5.75F, 2.9667F, 0.781F, 0.35F);
		b.texOffs(60, 45).addBox(-1.4615F, -2.3444F, 6.1F, 2.923F, 0.7444F, 0.35F);
		b.texOffs(68, 45).addBox(-1.7452F, -3.0888F, 6.1F, 3.4904F, 0.7444F, 0.35F);
		b.texOffs(77, 45).addBox(-1.7452F, -3.8332F, 6.1F, 3.4904F, 0.7444F, 0.35F);
		b.texOffs(86, 45).addBox(-1.4615F, -4.5776F, 6.1F, 2.923F, 0.7444F, 0.35F);
		b.texOffs(94, 45).addBox(-1.4396F, -2.3093F, 6.45F, 2.8792F, 0.7093F, 0.35F);
		b.texOffs(102, 45).addBox(-1.7191F, -3.0187F, 6.45F, 3.4382F, 0.7093F, 0.35F);
		b.texOffs(111, 45).addBox(-1.7191F, -3.728F, 6.45F, 3.4382F, 0.7093F, 0.35F);
		b.texOffs(120, 45).addBox(-1.4396F, -4.4374F, 6.45F, 2.8792F, 0.7093F, 0.35F);
		b.texOffs(128, 45).addBox(-1.4178F, -2.2772F, 6.8F, 2.8355F, 0.6772F, 0.35F);
		b.texOffs(136, 45).addBox(-1.693F, -2.9543F, 6.8F, 3.3859F, 0.6772F, 0.35F);
		b.texOffs(145, 45).addBox(-1.693F, -3.6315F, 6.8F, 3.3859F, 0.6772F, 0.35F);
		b.texOffs(154, 45).addBox(-1.4178F, -4.3086F, 6.8F, 2.8355F, 0.6772F, 0.35F);
		b.texOffs(106, 67).addBox(-1.3959F, -2.2482F, 7.15F, 2.7918F, 0.6482F, 0.35F);
		b.texOffs(114, 67).addBox(-1.6669F, -2.8964F, 7.15F, 3.3337F, 0.6482F, 0.35F);
		b.texOffs(123, 67).addBox(-1.6669F, -3.5445F, 7.15F, 3.3337F, 0.6482F, 0.35F);
		b.texOffs(132, 67).addBox(-1.3959F, -4.1927F, 7.15F, 2.7918F, 0.6482F, 0.35F);
		b.texOffs(140, 67).addBox(-1.374F, -2.2212F, 7.5F, 2.748F, 0.6212F, 0.35F);
		b.texOffs(148, 67).addBox(-1.6407F, -2.8424F, 7.5F, 3.2815F, 0.6212F, 0.35F);
		b.texOffs(157, 67).addBox(-1.6407F, -3.4636F, 7.5F, 3.2815F, 0.6212F, 0.35F);
		b.texOffs(166, 67).addBox(-1.374F, -4.0848F, 7.5F, 2.748F, 0.6212F, 0.35F);
		b.texOffs(174, 67).addBox(-1.3522F, -2.1955F, 7.85F, 2.7043F, 0.5955F, 0.35F);
		b.texOffs(182, 67).addBox(-1.6146F, -2.791F, 7.85F, 3.2293F, 0.5955F, 0.35F);
		b.texOffs(191, 67).addBox(-1.6146F, -3.3865F, 7.85F, 3.2293F, 0.5955F, 0.35F);
		b.texOffs(200, 67).addBox(-1.3522F, -3.9821F, 7.85F, 2.7043F, 0.5955F, 0.35F);
		b.texOffs(208, 67).addBox(-1.3303F, -2.1704F, 8.2F, 2.6606F, 0.5704F, 0.35F);
		b.texOffs(0, 69).addBox(-1.5885F, -2.7409F, 8.2F, 3.177F, 0.5704F, 0.35F);
		b.texOffs(9, 69).addBox(-1.5885F, -3.3113F, 8.2F, 3.177F, 0.5704F, 0.35F);
		b.texOffs(18, 69).addBox(-1.3303F, -3.8817F, 8.2F, 2.6606F, 0.5704F, 0.35F);
		b.texOffs(26, 69).addBox(-1.3084F, -2.1453F, 8.55F, 2.6168F, 0.5453F, 0.35F);
		b.texOffs(33, 69).addBox(-1.5624F, -2.6906F, 8.55F, 3.1248F, 0.5453F, 0.35F);
		b.texOffs(41, 69).addBox(-1.5624F, -3.2358F, 8.55F, 3.1248F, 0.5453F, 0.35F);
		b.texOffs(49, 69).addBox(-1.3084F, -3.7811F, 8.55F, 2.6168F, 0.5453F, 0.35F);
		b.texOffs(56, 69).addBox(-1.2944F, -2.1287F, 8.9F, 2.5887F, 0.5287F, 0.1F);
		b.texOffs(63, 69).addBox(-1.5456F, -2.6575F, 8.9F, 3.0912F, 0.5287F, 0.1F);
		b.texOffs(71, 69).addBox(-1.5456F, -3.1862F, 8.9F, 3.0912F, 0.5287F, 0.1F);
		b.texOffs(79, 69).addBox(-1.2944F, -3.7149F, 8.9F, 2.5887F, 0.5287F, 0.1F);
		b.texOffs(86, 69).addBox(-1.1118F, -5.4064F, 1.0F, 2.2237F, 0.4064F, 0.34F);
		b.texOffs(93, 69).addBox(-1.25F, -5.8127F, 1.0F, 2.5F, 0.4064F, 0.34F);
		b.texOffs(100, 69).addBox(-1.1118F, -6.2191F, 1.0F, 2.2237F, 0.4064F, 0.34F);
		b.texOffs(107, 69).addBox(-1.1118F, -5.6058F, 1.34F, 2.2237F, 0.6058F, 0.34F);
		b.texOffs(114, 69).addBox(-1.25F, -6.2116F, 1.34F, 2.5F, 0.6058F, 0.34F);
		b.texOffs(121, 69).addBox(-1.1118F, -6.8173F, 1.34F, 2.2237F, 0.6058F, 0.34F);
		b.texOffs(162, 45).addBox(-1.1118F, -5.6814F, 1.68F, 2.2237F, 0.6814F, 0.34F);
		b.texOffs(169, 45).addBox(-1.25F, -6.3628F, 1.68F, 2.5F, 0.6814F, 0.34F);
		b.texOffs(176, 45).addBox(-1.1118F, -7.0442F, 1.68F, 2.2237F, 0.6814F, 0.34F);
		b.texOffs(183, 45).addBox(-1.1118F, -5.7248F, 2.02F, 2.2237F, 0.7248F, 0.34F);
		b.texOffs(190, 45).addBox(-1.25F, -6.4497F, 2.02F, 2.5F, 0.7248F, 0.34F);
		b.texOffs(197, 45).addBox(-1.1118F, -7.1745F, 2.02F, 2.2237F, 0.7248F, 0.34F);
		b.texOffs(204, 45).addBox(-1.1118F, -5.7286F, 2.36F, 2.2237F, 0.7286F, 0.34F);
		b.texOffs(211, 45).addBox(-1.25F, -6.4573F, 2.36F, 2.5F, 0.7286F, 0.34F);
		b.texOffs(0, 48).addBox(-1.1118F, -7.1859F, 2.36F, 2.2237F, 0.7286F, 0.34F);
		b.texOffs(7, 48).addBox(-1.1118F, -5.6815F, 2.7F, 2.2237F, 0.6815F, 0.34F);
		b.texOffs(14, 48).addBox(-1.25F, -6.363F, 2.7F, 2.5F, 0.6815F, 0.34F);
		b.texOffs(21, 48).addBox(-1.1118F, -7.0445F, 2.7F, 2.2237F, 0.6815F, 0.34F);
		b.texOffs(128, 69).addBox(-1.1118F, -5.608F, 3.04F, 2.2237F, 0.608F, 0.34F);
		b.texOffs(135, 69).addBox(-1.25F, -6.216F, 3.04F, 2.5F, 0.608F, 0.34F);
		b.texOffs(142, 69).addBox(-1.1118F, -6.824F, 3.04F, 2.2237F, 0.608F, 0.34F);
		b.texOffs(149, 69).addBox(-1.1118F, -5.5333F, 3.38F, 2.2237F, 0.5333F, 0.34F);
		b.texOffs(156, 69).addBox(-1.25F, -6.0667F, 3.38F, 2.5F, 0.5333F, 0.34F);
		b.texOffs(163, 69).addBox(-1.1118F, -6.6F, 3.38F, 2.2237F, 0.5333F, 0.34F);
		b.texOffs(170, 69).addBox(-1.1118F, -5.4438F, 3.72F, 2.2237F, 0.4438F, 0.34F);
		b.texOffs(177, 69).addBox(-1.25F, -5.8877F, 3.72F, 2.5F, 0.4438F, 0.34F);
		b.texOffs(184, 69).addBox(-1.1118F, -6.3315F, 3.72F, 2.2237F, 0.4438F, 0.34F);
		b.texOffs(191, 69).addBox(-1.1118F, -5.3468F, 4.06F, 2.2237F, 0.3468F, 0.34F);
		b.texOffs(198, 69).addBox(-1.25F, -5.6936F, 4.06F, 2.5F, 0.3468F, 0.34F);
		b.texOffs(205, 69).addBox(-1.1118F, -6.0404F, 4.06F, 2.2237F, 0.3468F, 0.34F);
		b.texOffs(212, 69).addBox(2.4405F, -1.6978F, -3.8F, 0.6513F, 0.3978F, 0.45F);
		b.texOffs(216, 69).addBox(-3.0918F, -1.6978F, -3.8F, 0.6513F, 0.3978F, 0.45F);
		b.texOffs(220, 69).addBox(2.4F, -2.0956F, -3.8F, 0.7322F, 0.3978F, 0.45F);
		b.texOffs(0, 71).addBox(-3.1322F, -2.0956F, -3.8F, 0.7322F, 0.3978F, 0.45F);
		b.texOffs(4, 71).addBox(2.4405F, -2.4933F, -3.8F, 0.6513F, 0.3978F, 0.45F);
		b.texOffs(8, 71).addBox(-3.0918F, -2.4933F, -3.8F, 0.6513F, 0.3978F, 0.45F);
		b.texOffs(12, 71).addBox(2.4645F, -1.8475F, -3.35F, 1.0374F, 0.5475F, 0.45F);
		b.texOffs(16, 71).addBox(-3.5019F, -1.8475F, -3.35F, 1.0374F, 0.5475F, 0.45F);
		b.texOffs(20, 71).addBox(2.4F, -2.395F, -3.35F, 1.1664F, 0.5475F, 0.45F);
		b.texOffs(25, 71).addBox(-3.5664F, -2.395F, -3.35F, 1.1664F, 0.5475F, 0.45F);
		b.texOffs(30, 71).addBox(2.4645F, -2.9424F, -3.35F, 1.0374F, 0.5475F, 0.45F);
		b.texOffs(34, 71).addBox(-3.5019F, -2.9424F, -3.35F, 1.0374F, 0.5475F, 0.45F);
		b.texOffs(28, 48).addBox(2.4862F, -1.913F, -2.9F, 1.3869F, 0.613F, 0.45F);
		b.texOffs(33, 48).addBox(-3.8731F, -1.913F, -2.9F, 1.3869F, 0.613F, 0.45F);
		b.texOffs(38, 48).addBox(2.4F, -2.526F, -2.9F, 1.5593F, 0.613F, 0.45F);
		b.texOffs(44, 48).addBox(-3.9593F, -2.526F, -2.9F, 1.5593F, 0.613F, 0.45F);
		b.texOffs(50, 48).addBox(2.4862F, -3.139F, -2.9F, 1.3869F, 0.613F, 0.45F);
		b.texOffs(55, 48).addBox(-3.8731F, -3.139F, -2.9F, 1.3869F, 0.613F, 0.45F);
		b.texOffs(60, 48).addBox(2.4963F, -1.9405F, -2.45F, 1.5502F, 0.6405F, 0.45F);
		b.texOffs(66, 48).addBox(-4.0465F, -1.9405F, -2.45F, 1.5502F, 0.6405F, 0.45F);
		b.texOffs(72, 48).addBox(2.4F, -2.581F, -2.45F, 1.7429F, 0.6405F, 0.45F);
		b.texOffs(78, 48).addBox(-4.1429F, -2.581F, -2.45F, 1.7429F, 0.6405F, 0.45F);
		b.texOffs(84, 48).addBox(2.4963F, -3.2214F, -2.45F, 1.5502F, 0.6405F, 0.45F);
		b.texOffs(90, 48).addBox(-4.0465F, -3.2214F, -2.45F, 1.5502F, 0.6405F, 0.45F);
		b.texOffs(96, 48).addBox(2.5013F, -1.9555F, -2.0F, 1.6304F, 0.6555F, 0.45F);
		b.texOffs(102, 48).addBox(-4.1317F, -1.9555F, -2.0F, 1.6304F, 0.6555F, 0.45F);
		b.texOffs(108, 48).addBox(2.4F, -2.611F, -2.0F, 1.833F, 0.6555F, 0.45F);
		b.texOffs(114, 48).addBox(-4.233F, -2.611F, -2.0F, 1.833F, 0.6555F, 0.45F);
		b.texOffs(120, 48).addBox(2.5013F, -3.2665F, -2.0F, 1.6304F, 0.6555F, 0.45F);
		b.texOffs(126, 48).addBox(-4.1317F, -3.2665F, -2.0F, 1.6304F, 0.6555F, 0.45F);
		b.texOffs(132, 48).addBox(2.5043F, -1.9646F, -1.55F, 1.6789F, 0.6646F, 0.45F);
		b.texOffs(138, 48).addBox(-4.1832F, -1.9646F, -1.55F, 1.6789F, 0.6646F, 0.45F);
		b.texOffs(144, 48).addBox(2.4F, -2.6292F, -1.55F, 1.8875F, 0.6646F, 0.45F);
		b.texOffs(150, 48).addBox(-4.2875F, -2.6292F, -1.55F, 1.8875F, 0.6646F, 0.45F);
		b.texOffs(156, 48).addBox(2.5043F, -3.2937F, -1.55F, 1.6789F, 0.6646F, 0.45F);
		b.texOffs(162, 48).addBox(-4.1832F, -3.2937F, -1.55F, 1.6789F, 0.6646F, 0.45F);
		b.texOffs(168, 48).addBox(2.505F, -1.9667F, -1.1F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(174, 48).addBox(-4.195F, -1.9667F, -1.1F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(180, 48).addBox(2.4F, -2.6333F, -1.1F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(186, 48).addBox(-4.3F, -2.6333F, -1.1F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(192, 48).addBox(2.505F, -3.3F, -1.1F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(198, 48).addBox(-4.195F, -3.3F, -1.1F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(204, 48).addBox(2.505F, -1.9667F, -0.65F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(210, 48).addBox(-4.195F, -1.9667F, -0.65F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(216, 48).addBox(2.4F, -2.6333F, -0.65F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(0, 51).addBox(-4.3F, -2.6333F, -0.65F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(6, 51).addBox(2.505F, -3.3F, -0.65F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(12, 51).addBox(-4.195F, -3.3F, -0.65F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(18, 51).addBox(2.505F, -1.9667F, -0.2F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(24, 51).addBox(-4.195F, -1.9667F, -0.2F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(30, 51).addBox(2.4F, -2.6333F, -0.2F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(36, 51).addBox(-4.3F, -2.6333F, -0.2F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(42, 51).addBox(2.505F, -3.3F, -0.2F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(48, 51).addBox(-4.195F, -3.3F, -0.2F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(54, 51).addBox(2.505F, -1.9667F, 0.25F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(60, 51).addBox(-4.195F, -1.9667F, 0.25F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(66, 51).addBox(2.4F, -2.6333F, 0.25F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(72, 51).addBox(-4.3F, -2.6333F, 0.25F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(78, 51).addBox(2.505F, -3.3F, 0.25F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(84, 51).addBox(-4.195F, -3.3F, 0.25F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(90, 51).addBox(2.505F, -1.9667F, 0.7F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(96, 51).addBox(-4.195F, -1.9667F, 0.7F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(102, 51).addBox(2.4F, -2.6333F, 0.7F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(108, 51).addBox(-4.3F, -2.6333F, 0.7F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(114, 51).addBox(2.505F, -3.3F, 0.7F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(120, 51).addBox(-4.195F, -3.3F, 0.7F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(126, 51).addBox(2.505F, -1.9667F, 1.15F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(132, 51).addBox(-4.195F, -1.9667F, 1.15F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(138, 51).addBox(2.4F, -2.6333F, 1.15F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(144, 51).addBox(-4.3F, -2.6333F, 1.15F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(150, 51).addBox(2.505F, -3.3F, 1.15F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(156, 51).addBox(-4.195F, -3.3F, 1.15F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(162, 51).addBox(2.505F, -1.9667F, 1.6F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(168, 51).addBox(-4.195F, -1.9667F, 1.6F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(174, 51).addBox(2.4F, -2.6333F, 1.6F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(180, 51).addBox(-4.3F, -2.6333F, 1.6F, 1.9F, 0.6667F, 0.45F);
		b.texOffs(186, 51).addBox(2.505F, -3.3F, 1.6F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(192, 51).addBox(-4.195F, -3.3F, 1.6F, 1.69F, 0.6667F, 0.45F);
		b.texOffs(198, 51).addBox(2.5031F, -1.9578F, 2.05F, 1.659F, 0.6578F, 0.45F);
		b.texOffs(204, 51).addBox(-4.162F, -1.9578F, 2.05F, 1.659F, 0.6578F, 0.45F);
		b.texOffs(210, 51).addBox(2.4F, -2.6157F, 2.05F, 1.8651F, 0.6578F, 0.45F);
		b.texOffs(216, 51).addBox(-4.2651F, -2.6157F, 2.05F, 1.8651F, 0.6578F, 0.45F);
		b.texOffs(0, 54).addBox(2.5031F, -3.2735F, 2.05F, 1.659F, 0.6578F, 0.45F);
		b.texOffs(6, 54).addBox(-4.162F, -3.2735F, 2.05F, 1.659F, 0.6578F, 0.45F);
		b.texOffs(12, 54).addBox(2.4927F, -1.9107F, 2.5F, 1.4921F, 0.6107F, 0.45F);
		b.texOffs(17, 54).addBox(-3.9848F, -1.9107F, 2.5F, 1.4921F, 0.6107F, 0.45F);
		b.texOffs(22, 54).addBox(2.4F, -2.5215F, 2.5F, 1.6775F, 0.6107F, 0.45F);
		b.texOffs(28, 54).addBox(-4.0775F, -2.5215F, 2.5F, 1.6775F, 0.6107F, 0.45F);
		b.texOffs(34, 54).addBox(2.4927F, -3.1322F, 2.5F, 1.4921F, 0.6107F, 0.45F);
		b.texOffs(39, 54).addBox(-3.9848F, -3.1322F, 2.5F, 1.4921F, 0.6107F, 0.45F);
		b.texOffs(38, 71).addBox(2.4691F, -1.807F, 2.95F, 1.1128F, 0.507F, 0.45F);
		b.texOffs(43, 71).addBox(-3.5819F, -1.807F, 2.95F, 1.1128F, 0.507F, 0.45F);
		b.texOffs(48, 71).addBox(2.4F, -2.3141F, 2.95F, 1.251F, 0.507F, 0.45F);
		b.texOffs(53, 71).addBox(-3.651F, -2.3141F, 2.95F, 1.251F, 0.507F, 0.45F);
		b.texOffs(58, 71).addBox(2.4691F, -2.8211F, 2.95F, 1.1128F, 0.507F, 0.45F);
		b.texOffs(63, 71).addBox(-3.5819F, -2.8211F, 2.95F, 1.1128F, 0.507F, 0.45F);
		b.texOffs(0, 0).addBox(-3.6F, -1.3F, -9.5F, 7.2F, 0.6F, 18.5F);
		b.texOffs(95, 0).addBox(-0.3F, -6.4F, 8.2F, 0.6F, 2.4F, 1.8F);
		b.texOffs(44, 54).addBox(0.4F, -3.1F, 9.0F, 0.6F, 0.5F, 0.6F);
		b.texOffs(48, 54).addBox(-1.0F, -3.1F, 9.0F, 0.6F, 0.5F, 0.6F);
		b.texOffs(48, 27).addBox(-6.9F, -0.8F, -12.0F, 13.8F, 0.35F, 2.8F);
		b.texOffs(83, 27).addBox(1.7F, -1.1F, -11.6F, 4.6F, 0.3F, 1.8F);
		b.texOffs(97, 27).addBox(-6.3F, -1.1F, -11.6F, 4.6F, 0.3F, 1.8F);
		b.texOffs(52, 54).addBox(-0.4F, -1.6F, -10.9F, 0.8F, 0.8F, 0.7F);
		b.texOffs(101, 0).addBox(-4.0F, -7.1F, 8.2F, 8.0F, 0.6F, 3.6F);
		b.texOffs(111, 27).addBox(-3.8F, -5.8F, 9.0F, 7.6F, 0.4F, 2.4F);
		b.texOffs(53, 0).addBox(3.7F, -7.2F, 7.6F, 0.3F, 4.0F, 4.4F);
		b.texOffs(64, 0).addBox(-4.0F, -7.2F, 7.6F, 0.3F, 4.0F, 4.4F);
		b.texOffs(68, 71).addBox(2.9F, -2.45F, -7.5F, 1.8F, 0.25F, 0.6F);
		b.texOffs(74, 71).addBox(-4.7F, -2.45F, -7.5F, 1.8F, 0.25F, 0.6F);
		b.texOffs(80, 71).addBox(2.9F, -1.85F, -7.3F, 1.8F, 0.25F, 0.6F);
		b.texOffs(86, 71).addBox(-4.7F, -1.85F, -7.3F, 1.8F, 0.25F, 0.6F);
		b.texOffs(56, 54).addBox(2.1F, -2.6F, 8.3F, 3.4F, 0.3F, 1.0F);
		b.texOffs(66, 54).addBox(-5.5F, -2.6F, 8.3F, 3.4F, 0.3F, 1.0F);
		b.texOffs(92, 71).addBox(2.4F, -5.15F, -2.3F, 0.5F, 0.2F, 0.3F);
		b.texOffs(95, 71).addBox(-2.9F, -5.15F, -2.3F, 0.5F, 0.2F, 0.3F);
		b.texOffs(76, 54).addBox(2.9F, -5.3F, -2.5F, 0.5F, 0.45F, 0.7F);
		b.texOffs(80, 54).addBox(-3.4F, -5.3F, -2.5F, 0.5F, 0.45F, 0.7F);
		return b;
	}

	private static CubeListBuilder cubes_fw_plate_l() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(75, 0).addBox(-0.15F, -1.0F, -1.9F, 0.3F, 2.0F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_fw_plate_r() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(85, 0).addBox(-0.15F, -1.0F, -1.9F, 0.3F, 2.0F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fl() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(126, 0).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(134, 0).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fl_1() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(148, 0).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(156, 0).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fl_2() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(170, 0).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(178, 0).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fl_3() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(192, 0).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(200, 0).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fr() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(214, 0).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(0, 21).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fr_1() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(14, 21).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(22, 21).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fr_2() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(36, 21).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(44, 21).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_fr_3() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(58, 21).addBox(-1.2F, -1.9F, -0.3779F, 2.4F, 3.8F, 0.7559F);
		b.texOffs(66, 21).addBox(-1.2F, -0.3779F, -1.9F, 2.4F, 0.7559F, 3.8F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rl() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(80, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(89, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rl_1() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(104, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(113, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rl_2() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(128, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(137, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rl_3() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(152, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(161, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rr() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(176, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(185, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rr_1() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(200, 21).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(209, 21).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rr_2() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(0, 27).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(9, 27).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}

	private static CubeListBuilder cubes_wheel_rr_3() {
		CubeListBuilder b = CubeListBuilder.create();
		b.texOffs(24, 27).addBox(-1.4F, -2.05F, -0.4078F, 2.8F, 4.1F, 0.8155F);
		b.texOffs(33, 27).addBox(-1.4F, -0.4078F, -2.05F, 2.8F, 0.8155F, 4.1F);
		return b;
	}
}

# Based on linux-yocto-custom.bb

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
COMPATIBLE_MACHINE = "^clearfog(-gtr-(s4|l8))?$"

KERNEL_IMAGETYPE = "zImage"
KCONFIG_MODE = "--alldefconfig"

SRCBRANCH = "linux-5.1.y"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git;nocheckout=1;name=machine;branch=${SRCBRANCH}"
LINUX_VERSION ?= "5.1.21"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "4a9b1eb8bc3ba4ad8b3b1aa3317cf8d4a3aaad83"

PV = "${LINUX_VERSION}+git${SRCPV}"

KERNEL_DEVICETREE_clearfog = " \
	armada-388-clearfog-base.dtb \
	armada-388-clearfog-pro.dtb \
	armada-388-clearfog.dtb \
	"

KERNEL_DEVICETREE_clearfog-gtr-s4 = " \
	armada-385-clearfog-gtr-s4.dtb \
	"

KERNEL_DEVICETREE_clearfog-gtr-l8 = " \
	armada-385-clearfog-gtr-l8.dtb \
	"

SRC_URI += " \
	file://clearfog.cfg \
	file://0001-ARM-dts-add-support-for-Clearfog-GTR.patch \
	file://0002-HACK-ARM-dts-clearfog-gtr-enable-WiFi-LTE-modules.patch \
	"

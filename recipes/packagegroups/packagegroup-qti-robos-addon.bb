SUMMARY = "QTI Robotics OS Package Group"

LICENSE = "BSD-3-Clause-Clear"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = ' \
    packagegroup-qti-robos-addon \
'

RDEPENDS:packagegroup-qti-robos-addon = ' \
        tdk-chx01-get-data \
        tdk-thermistor-get-data \
'

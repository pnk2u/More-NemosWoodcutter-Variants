<!--publish=false-->
### 2.0.0:
- Fix _Woodcutter_ Variants' crafting recipes sometimes being overwritten by the default Woodcutter recipe
- `1.21.4(-11)`:
  - Fix _**Pale Oak** Woodcutter_'s crafting recipe not unlocking upon obtaining _Pale Oak Logs_
  - Fix _**Pale Oak** Woodcutter_ not dropping when mined
- Change <ins>Nemo's Woodcutter</ins> (&#x200A;<sub><a title="Nemo's Woodcutter&#10;on Modrinth" href="https://modrinth.com/mod/nemos-woodcutter/"><img width=20 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a></sub><!--SEPARATOR_V:MR--><img width=5 height=8 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"><sub><a title="Nemo's Woodcutter&#10;on Curseforge" href="https://www.curseforge.com/minecraft/mc-mods/nemos-woodcutter/"><img width=20 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a></sub>&#x200A;) required version to one static version per release:
    - &nbsp;  
      |||  
      |--|--|  
      |`1.20.1`|[`1.12.3-1.20.1`](https://modrinth.com/mod/nemos-woodcutter/version/1.12.3-1.20.1)|  
      |`1.21(.1)`|[`1.12.3-1.21.1`](https://modrinth.com/mod/nemos-woodcutter/version/1.12.3-1.21.1)|  
      |`1.21.4(-11)`|[`1.21.11-1.14.1`](https://modrinth.com/mod/nemos-woodcutter/version/1.21.11-1.14.1)|  
- Internal Changes:
    - Update Mod ID from `nemosmorewoodcuttervariants` to `nemos_more_woodcutter_variants`
      > This does not affect existing saves negatively, as the mod will still recognize the old ID and migrate it to the new one seamlessly.
    - `1.20.1`: Now requires at least Fabric API [`0.92.8`](https://modrinth.com/mod/fabric-api/version/0.92.8+1.20.1) (latest: [`0.92.9`](https://modrinth.com/mod/fabric-api/version/0.92.9+1.20.1)) to allow for the seamless save migration as described above
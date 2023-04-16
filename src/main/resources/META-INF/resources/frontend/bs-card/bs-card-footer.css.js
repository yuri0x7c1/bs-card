
import { css } from 'lit';

export const BsCardFooterCss = css`
    :host {
        padding: var(--lumo-space-m);
        margin-bottom: 0;
        background-color: var(--bs-card-footer-background-color, var(--lumo-contrast-5pct));
        border-bottom: var(--bs-card-border, 1px solid var(--lumo-contrast-20pct));
        border-radius: var(--bs-card-border-radius, 0px);
    }
`;
